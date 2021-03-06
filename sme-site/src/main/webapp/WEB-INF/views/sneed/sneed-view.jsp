<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>需求列表- 中小企业服务平台</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- basic styles -->
		<link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/ui.jqgrid.css" />
		<!-- fonts -->

		<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />

		<!-- ace styles -->

		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/ace.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="${pageContext.request.contextPath}/resources/assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="${pageContext.request.contextPath}/resources/assets/js/html5shiv.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/respond.min.js"></script>
		<![endif]-->
		
	</head>

	<body>
		<!-- header -->
		<jsp:include page="${pageContext.request.contextPath}/widget/header.jsp"/>
		

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<!-- nav siderbar -->
				<jsp:include page="${pageContext.request.contextPath}/widget/sidebar.jsp"/>
				<!-- content -->

				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="/home">首页</a>
							</li>
							<li>
								<a href="/cp/sneed/list">需求管理</a>
							</li>
							<li class="active">服务记录</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							
						</div><!-- #nav-search -->
					</div>

					<div class="page-content">
						<div class="row">
							<div class="col-xs-12">
								<h3 class="header smaller lighter blue">服务机构列表</h3>
								<button class="btn btn-info" type="button" onclick="fun_check();">
									<i class="icon-pencil bigger-110"></i>
									选择
								</button>
							</div>
							<div class="col-xs-12">
								<table id="grid-table"></table>
								<div id="grid-pager"></div>
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->
			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div>
	<!-- /.main-container -->
	<jsp:include page="${pageContext.request.contextPath}/widget/footer.jsp"/>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jqGrid/jquery.jqGrid.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jqGrid/i18n/grid.locale-en.js"></script>

	<script type="text/javascript">
		var ctx="${pageContext.request.contextPath}";
		
		jQuery(function($) {
			var grid_selector = "#grid-table";
			var pager_selector = "#grid-pager";
		
			jQuery(grid_selector).jqGrid({
				url: ctx+"/cp/sneed/bid/datagrid?id=${sneed.id}",
				datatype: "json",
				mtype: "POST",
				height: 300,
				colNames:['编码','需求名称', '机构名称','提交时间','是否选择','状态','备注信息'],
				colModel:[
					{name:'id',index:'id', width:60, sorttype:"int"},
					{name:'sneedtitle',index:'sneedtitle',width:150},
					{name:'svgtitle',index:'svgtitle', width:150},
					{name:'addtimestr',index:'addtimestr', width:90},
					{name:'istoned',index:'istoned', width:90,formatter:formatstone},
					{name:'status',index:'status', width:90,formatter:formatstatus},
					{name:'remark',index:'remark', width:150},
				], 
				viewrecords : true,
				rowNum:10,
				rowList:[10,20,30],
				pager : pager_selector,
				altRows: true,
				//toppager: true,
				
				multiselect: true,
				//multikey: "ctrlKey",
		        multiboxonly: true,
				caption: "",
				autowidth: true
			});
		});
		
		function fun_check(){
			var selectedIds = $("#grid-table").jqGrid("getGridParam", "selarrrow");
			if (selectedIds.length==1){
				$.post(ctx+"/cp/sneed/stoned?id="+selectedIds[0], function (data) {
					layer.alert(data.msg);
	            });
            	window.location.href = "/cp/sneed/view?id=${sneed.id}";
			}else{
				layer.alert("请选择单条记录！");
				return;
			}
		}
		
		function formatstone(cellval,options,rowobj){
			var str = "";
	    	if(cellval=="1"){
	    		str = "<font style=''>是</font>";
	    	}
	    	return str;
		}
		
		function formatstatus(cellval,options,rowobj){
			var str = "";
	    	if(cellval=="0"){
	    		str = "<font style=''>已受理</font>";
	    	}else if(cellval=="1"){
	    		str = "<font color='green'>已办理</font>";
	    	}else if(cellval=="-1"){
	    		str = "<font color='red'>已取消</font>";
	    	}
	    	return str;
		}
	</script>
	</body>
</html>
