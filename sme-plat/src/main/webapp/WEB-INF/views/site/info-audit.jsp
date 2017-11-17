<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>信息审核表单</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/default.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/Site.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/Common.js"></script>
<script type="text/javascript">
var ctx = "${pageContext.request.contextPath}";
$(function() {
	$("#infoBtnAudit").click(function() {
		var infoid = $("#infoid").val();
		var posturl = ctx + "/info/audit";
		$.ajax({  
            type: "POST",  
            url: posturl,  
            data: "id="+infoid+"&result="+$("#result").val()+"&remark="+$("#remark").val(),//将对象序列化成JSON字符串  
            dataType:"json",  
            //contentType : 'application/json;charset=utf-8', //设置请求头信息  
            success: function(res){
            	$.messager.show({
    				title : '友情提示',
    				msg : res.msg,
    				timeout : 3000,
    				showType : 'slide'
    			});
            	window.location.href = ctx+"/info/audits";
            },  
            error: function(res){
            	$.messager.show({
    				title : '友情提示',
    				msg : res.msg,
    				timeout : 3000,
    				showType : 'slide'
    			});
        	}
        });
	});
});
</script>
</head>
<body style="margin: 10px; padding: 0px; background-color: #fff;">
	<fieldset>
		<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">信息审核</legend>
		<form id="myform" action="edit" method="post">
			<input type="hidden" id="infoid" name="infoid" value="${info.id}" />
			<table cellpadding="3" cellspacing="0" class="edit_table"
				id="tbEditForm">
				<tr>
					<td class="edit_title"><tt>*</tt>信息标题：</td>
					<td>${info.title}</td>
				</tr>
				<tr>
					<td class="edit_title"><tt>*</tt>信息来源：</td>
					<td>${info.source}</td>
				</tr>
				
				<tr>
					<td class="edit_title"><tt>*</tt>发布时间：</td>
					<td>${info.addtimestr}</td>
				</tr>
				
				<tr>
					<td class="edit_title"><tt>*</tt>是否同意：</td>
					<td><select id="result" name="result">
						<option value="1">同意</option>
						<option value="0">不同意</option>
					</select>
					</td>
				</tr>
				<tr>
					<td class="edit_title"><tt>*</tt>审核意见：</td>
					<td>
						<textarea rows="" cols="" name="remark" id="remark" style="width: 500px;height: 122px;"></textarea>
					</td>
				</tr>
				<tr style="height: 50px;">
					<td colspan="2" style="text-align: right">
					<a id="infoBtnAudit" class="easyui-linkbutton" data-options="iconCls:'icon-add'"
						href="javascript:" >保存</a>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
