<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>咨询信息-中小企业服务平台</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->
		<link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/jquery-ui-1.10.3.custom.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/chosen.css" />

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
							<li class="active">信息咨询</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							
						</div><!-- #nav-search -->
					</div>

					<div class="page-content">
						<div class="page-header">
							<h1>咨询发布</h1>
						</div><!-- /.page-header -->

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->

								<form class="form-horizontal" role="form">
									 <input type="hidden" id="id" value="${consult.id }"> 
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="title"> 咨询主题 </label>
										<div class="col-sm-9">
											<input type="text" id="title" placeholder="" class="col-xs-10 col-sm-5" maxlength="200"/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="svgid"> 咨询部门</label>

										<div class="col-sm-3">
											<select class="form-control" id="svgid" name="svgid">
												<c:forEach items="${svorglist }" var="svorg">
													<option value="${svorg.id }" <c:if test="${svorg.id==consult.svgid }">selected="selected"</c:if>>${svorg.title }</option>
												</c:forEach>
											</select>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="scode"> 咨询事项</label>

										<div class="col-sm-3">
											<select class="form-control" id="scode" name="scode">
												<c:forEach items="${sclasslist }" var="sclass">
													<option value="${sclass.id }" <c:if test="${sclass.id==consult.scode }">selected="selected"</c:if>>${sclass.title }</option>
												</c:forEach>
											</select>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="content"> 内&nbsp;&nbsp;容</label>
										<div class="col-sm-9">
											<textarea id="content" name="content" style="width: 570px; height: 200px; ">${consult.content }</textarea>
										</div>
									</div>
									<div class="space-4"></div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="linker"> 联系人</label>
										<div class="col-sm-9">
											<input type="text" id="linker" placeholder="" class="col-xs-10 col-sm-5" value="${user.name }"/>
										</div>
									</div>
									<div class="space-4"></div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="linktel"> 联系电话 </label>

										<div class="col-sm-9">
											<input type="text" id="linktel" placeholder="" class="col-xs-10 col-sm-5" value="${user.phone }"/>
										</div>
									</div>
									<div class="space-4"></div>

									<div class="clearfix form-actions">
										<div class="col-md-offset-3 col-md-9">
											<button id="save_btn" class="btn btn-info" type="button">
												<i class="icon-ok bigger-110"></i>
												保存
											</button>

											&nbsp; &nbsp; &nbsp;
											<button id="reset_btn" class="btn" type="reset">
												<i class="icon-undo bigger-110"></i>
												取消
											</button>
										</div>
									</div>

									<div class="hr hr-24"></div>
								</form>
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div><!-- /.main-content -->

				
			</div><!-- /.main-container-inner -->

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-2.0.3.min.js"></script>
		<!-- <![endif]-->

		<!--[if IE]>
		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-1.10.2.min.js"></script>
		<![endif]-->
		

		<script type="text/javascript">
		</script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="${pageContext.request.contextPath}/resources/assets/js/excanvas.min.js"></script>
		<![endif]-->

		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/chosen.jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.inputlimiter.1.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.maskedinput.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-tag.min.js"></script>

		<!-- ace scripts -->

		<script src="${pageContext.request.contextPath}/resources/assets/js/ace-elements.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/layer/layer.js"></script>
		<script type="text/javascript">
	    $(function () {
	    	$("#reset_btn").click(function() {   
			   $("form").each(function() {   
			   		this.reset(); 
			   });  
			}); 
			  
			$("#save_btn").click(function () {
					var attachs = new Array();
					var title = $("#title").val();
					var content= $("#content").val();
					if (title==""){
						layer.alert("主题不能为空！");
						$("#title").focus();
						return;
					}
					if (content==""){
						layer.alert("咨询内容不能为空！");
						$("#content").focus();
						return;
					}
	                var param = {
	                    title: $("#title").val(),
	                    content: $("#content").val(),
	                    scode: $("#scode").val(),
	                    svgid: $("#svgid").val(),
	                    linker: $("#linker").val(),
	                    linktel: $("#linktel").val(),
	                    attachs:attachs
	                };
	                
	                $.ajax({  
	                    type: "POST",  
	                    url: "/cp/consult/add",  
	                    data: JSON.stringify(param),//将对象序列化成JSON字符串  
	                    dataType:"json",  
	                    contentType : 'application/json;charset=utf-8', //设置请求头信息  
	                    success: function(data){
	                    	layer.alert("提交成功！");
	                    	window.location.href = "/cp/consult/list";
	                    },  
	                    error: function(res){
	                    	layer.alert("添加失败，请您检查！");
	                	}
	                });
	            });
	    });
        
    </script>
	</body>
</html>
