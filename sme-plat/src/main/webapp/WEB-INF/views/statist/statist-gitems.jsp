<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>行政诉求主题列表</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
var ctx="${pageContext.request.contextPath}";
</script>
<style type="text/css">
.datagrid-row {
	height: 35px;
}
</style>
</head>
<body>
	<div class="easyui-layout" fit="true" border="false">
		<div data-options="region:'north',title:''" style="height: 60px; background: #F4F4F4;">
			<form id="searchForm">
				<table>
				  <tr>
		              <th>事项标题：</th>
		              <td><input id="title" name="title" value="" class="textbox textbox_indent" style="height: 25px;"/></td>
		              <th>事项状态：</th>
		              <td>
		              	<select id="status" name="status" class="textbox textbox_indent" style="height: 25px;">
		              		<option value="">----- 请选择-----</option>
		              		<option value="0">等待受理</option>
		              		<option value="1">已办理</option>
		              		<option value="2">正在办理</option>
		              		<option value="-1">已取消</option>
		              	</select>
		              </td>
		              <th>办理结果：</th>
		              <td>
		              	<select id="result" name="result" class="textbox textbox_indent" style="height: 25px;">
		              		<option value="">----- 请选择-----</option>
		              		<option value="0">办理成功</option>
		              		<option value="1">驳回申请</option>
		              	</select>
		              </td>
		          	  <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
		          </tr>                     
				</table>
			</form>                                    
		</div>            
		<div data-options="region:'center',split:false">
			<table id="list_data" cellspacing="0" cellpadding="0">
				
			</table>
		</div>
	</div>
	
	<div id="topic_window"></div>
	
	<script type="text/javascript">
		$('#list_data').datagrid({
			height : 'auto',
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,//是否可折叠的 
			fit : true,//自动大小 
			loadMsg : '数据加载中请稍后……',
			url : ctx+'/appeal/statist/gitems',
			remoteSort : false,
			fitColums : true,
			checkOnSelect : true,
			//singleSelect : false,//是否单选 
			pagination : true,//分页控件 
			//rownumbers : true,//行号 
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			} ] ],
			columns : [ [ {
				field : 'topictitle',
				title : '事项名称',
				width : 100
			},{
				field : 'content',
				title : '事项简介',
				width : 250
			}, {
				field : 'corptitle',
				title : '企业',
				width : 150
			}, {
				field : 'addtimestr',
				title : '提交日期',
				width : 150
			}, {
				field : 'endtimestr',
				title : '办理日期',
				width : 150
			}, {
				field : 'pushnum',
				title : '督办次数',
				width : 150
			},{
				field : 'status',
				title : '状态',
				width : 100,
				formatter:function(value,row){
			    	var str = "";
			    	if(value=='0'){
			    		str = "等待受理";
			    	}else if(value=='1') {
			    		str = "已办理";
			    	}else if(value=='2') {
			    		str = "正在办理";
			    	}else if(value=='-1') {
			    		str = "已取消";
			    	}
			    	return str;
				}
			},{
				field : 'result',
				title : '处理结果',
				width : 100,
				formatter:function(value,row){
			    	var str = "";
			    	if(value=='1'){
			    		str = "已办理";
			    	}else if(value=='0'){
			    		str = "驳回";
			    	}
			    	return str;
				}
			}]],
			toolbar : [ {
				text : '查看',
				iconCls : 'icon-add',
				handler : function() {
					view();
				}
			}, '-', {
				text : '督办',
				iconCls : 'icon-more',
				handler : function() {
					push();
				}
			}]
		});
		//设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 15,//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
			beforePageText : '第',//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		});

		//查看事项详情
		function view(){
			var checkedRows = $("#list_data").datagrid('getChecked');
			 if(checkedRows.length == 1) {
				 location.href= ctx+"/appeal/item/view?id="+checkedRows[0].id;
			 }else if(checkedRows.length > 1) {
				$.messager.show({
					title : '提示',
					msg : '只能选择一条事项!',
					timeout : 3000,
					showType : 'slide'
				});
			}else if(checkedRows.length < 1){
				$.messager.show({
					title : '提示',
					msg : '请选择所要查看的事项!',
					timeout : 3000,
					showType : 'slide'
				});
			}else {
				$.messager.show({
					title : '提示',
					msg : '请勾选想要编辑的信息!',
					timeout : 3000,
					showType : 'slide'
				});
			}
		} 
	
		//事项督办
		function push(){
			var checkedRows = $("#list_data").datagrid('getChecked');
			if(checkedRows.length == 1) {
				var status = checkedRows[0].status;
				 if (status=='1'){
					 $.messager.show({
							title : '提示',
							msg : '事项已办理,暂时无法督办!',
							timeout : 3000,
							showType : 'slide'
					});
					return;
				}
				var win_dialog = $('#topic_window').dialog({
						title: '事项督办',
					    width: 600,
					    height:400,
					    closed: false,
					    cache: false,
					    href: ctx+'/appeal/item/push?id='+checkedRows[0].id,
					    modal: true,
					    buttons : [ {
							text : '督    办',
							handler : function() {
								$('#appealitem_pushForm').form('submit',{
									url : ctx+'/appeal/item/push',
									success : function(data) {
										var result = $.parseJSON(data);
										if (result.success) {
											$('#list_data').datagrid('load');
											win_dialog.dialog('close');
										}
										$.messager.show({
											title : '提示',
											msg : result.msg,
											timeout : 3000,
											showType : 'slide'
										});
									}
								});
							}
						} ]
				});
			} else if(checkedRows.length > 1) {
				$.messager.show({
					title : '提示',
					msg : '请选择一条记录操作!',
					timeout : 3000,
					showType : 'slide'
				});
			}else {
				$.messager.show({
					title : '提示',
					msg : '请选择一条记录操作!',
					timeout : 3000,
					showType : 'slide'
				});
			}
		}
		
		//搜索
		function searchFunc(){
			var param = $("#searchForm").serialize();
		    $("#list_data").datagrid("load",param);
	    }
		
	</script>
</body>
</html>
