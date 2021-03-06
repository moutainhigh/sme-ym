<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>数据上报表单-中小企业服务平台</title>
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
							<li>
								<a href="/cp/declare/topics">项目申报</a>
							</li>
							<li class="active">申报申请</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							
						</div><!-- #nav-search -->
					</div>

					<div class="page-content">
						<div class="page-header">
							<h1>数据上报</h1>
						</div>
						<!-- /.page-header -->
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->

								<form class="form-horizontal" role="form">
									 <input type="hidden" id="id" value="${reportItem.id }"> 
									 <input type="hidden" id="reportid" value="${report.id }">
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="title"> 报表名称 </label>
										<div class="col-sm-9">
											<input type="text" id="title" placeholder="" class="col-xs-10 col-sm-5" maxlength="200" value="${report.title }" readonly="readonly"/>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="svgid"> 上报部门</label>
										<div class="col-sm-3">
											<input type="text" id="svgtitle" placeholder="" class="col-xs-10 col-sm-5" maxlength="200" value="${report.svgtitle }" readonly="readonly"/>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="scode"> 报表模板</label>
										<div class="col-sm-9">
											<ul id="attachlist" class="left " style="width: 470px;">
							                	<c:forEach items="${report.attachs }" var="attach">
							                		<li>${attach.filename }&nbsp;&nbsp;&nbsp;&nbsp;[<a href="${attach.filepath }">下载</a>]</li>
							                	</c:forEach>
							                </ul>
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="content"> 内&nbsp;&nbsp;容</label>
										<div class="col-sm-9">
											<textarea id="remark" name="remark" style="width: 570px; height: 200px; ">${reportItem.remark }</textarea>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="content"> 附件上传</label>
										<div class="col-sm-9">
											<ul id="filelist" class="left " style="width: 470px;">
							                	<c:forEach items="${reportItem.attachs }" var="attach">
							                		<li id="attach_${attach.id }">${attach.filename }&nbsp;&nbsp;&nbsp;&nbsp;[<a href="${attach.filepath }">下载</a>]</li>
							                	</c:forEach>
							                </ul>
											<input type="file" value="上传文件" name="uploadify" id="uploadify" width="78" style="display: none;" height="23">
											<span id="fileQueue" style="float: right;" class="uploadifyQueue"></span>
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
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/uploadify/jquery.uploadify.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/uploadify/swfobject.js" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/site/js/Common.js"></script>
		<script type="text/javascript">
    	var ctx="${pageContext.request.contextPath}";
        var attachs = new Array();
        $(function () {
            $("#uploadify").uploadify({
                'uploader': '/resources/uploadify/uploadify.swf',
                'script': '/uploadfile',
                'cancelImg': '/resources/uploadify/cancel.png',
                'folder': 'UploadFile',
                'queueID': 'fileQueue',
                'auto': true,
                'multi': false,
                'buttonImg': '/resources/uploadify/uploadify.png',
                'width': 78,
                'height': 23,
                'onComplete': function (event, UserID, fileObj, response, data) {
                	console.log("response:",response);
                    if (response != null) {
                    	var result = eval("(" + response + ")");
                    	if (result.success){
                    		var attach = result.data;
                            attachs.push(attach);
                            $("#filelist").append("<li id='attach_"+attach.id+"' style='padding:5px;list-style-type: none;'>"+attach.filename+"[<a href='javascript:void(0)' onclick=delAttachClient('"+attach.id+"')>删除</a>]</li>");
                    	}
                        $("#txtTishi").html(result.msg);
                    }
                }
            });

            $("#save_btn").click(function () {
            	if (attachs.length<=0){
            		layer.alert("请上传附件。");
            		return;
            	}
            	var id =$("#id").val();
        		if (id != ""){
        			url=ctx+"/cp/report/item/edit";
        		}else{
        			url=ctx+"/cp/report/item/add";
        		}
                var postData = {
                	id:$("#id").val(),
                	reportid:$("#reportid").val(),
                	remark: $("#remark").val(),
                    attachs:attachs
                };
                
                console.log("postdata",postData);
                $.ajax({  
                    type: "POST",  
                    url: url,  
                    data: JSON.stringify(postData),//将对象序列化成JSON字符串  
                    dataType:"json",  
                    contentType : 'application/json;charset=utf-8', //设置请求头信息  
                    success: function(res){
                    	console.log(res);
                    	layer.alert(res.msg);
                    	window.location.href = ctx+"/cp/report/item";
                    },  
                    error: function(res){
                    	console.log("error",res);
                    	layer.alert(res.msg);
                	}
                });
            });
        });
  
        function delAttachClient(attachid){
        	if (attachs){
        		for(var i=0;i<attachs.length;i++){
        			var attach = attachs[i];
        			var attach_id = attach.id;
        			if (attach_id==attachid){
        				attachs.splice(i,1);
        				console.log(attachs);
        				$("#attach_"+attach_id).remove();
        				break;
        			}
        		}
        	}
        }
		</script>

	</body>
</html>
