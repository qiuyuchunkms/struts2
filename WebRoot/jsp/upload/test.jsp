<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>最基本的使用——plupload演示demo</title>
<script src="http://chaping.github.io/plupload/demo/js/jquery-1.10.2.min.js"></script>
<script src="http://chaping.github.io/plupload/demo/js/plupload.full.min.js"></script>
<style>
body {
	font-size: 12px;
}

body,p,div {
	padding: 0;
	margin: 0;
}

.wraper {
	padding: 30px 0;
}

.btn-wraper {
	text-align: center;
}

.btn-wraper input {
	margin: 0 10px;
}

#file-list {
	width: 350px;
	margin: 20px auto;
}

#file-list li {
	margin-bottom: 10px;
}

.file-name {
	line-height: 30px;
}

.progress {
	height: 4px;
	font-size: 0;
	line-height: 4px;
	background: orange;
	width: 0;
}

.tip1 {
	text-align: center;
	font-size: 14px;
	padding-top: 10px;
}

.tip2 {
	text-align: center;
	font-size: 12px;
	padding-top: 10px;
	color: #b00
}

.catalogue {
	position: fixed;
	_position: absolute;
	_width: 200px;
	left: 0;
	top: 0;
	border: 1px solid #ccc;
	padding: 10px;
	background: #eee
}

.catalogue a {
	line-height: 30px;
	color: #0c0
}

.catalogue li {
	padding: 0;
	margin: 0;
	list-style: none;
}
</style>
</head>
<body>
	<p class="tip2">注意：该demo把上传的地址设为了一个静态的html页面，所以文件并不会真正的上传到服务器，但这不会影响上传功能的演示！</p>
	<div class="wraper">
		<div class="btn-wraper">
			<input type="button" value="选择文件..." id="browse" />
			<input type="button" value="开始上传" id="upload-btn" />
		</div>
		<ul id="file-list">

		</ul>
	</div>
	<ul class="catalogue">
		<li>
			<a href="index.html">1、最基本的使用demo</a>
		</li>
		<li>
			<a href="index2.html">2、文件过滤功能demo</a>
		</li>
		<li>
			<a href="index3.html">3、拖拽上传功能demo</a>
		</li>
		<li>
			<a href="index4.html">4、图片预览功能demo</a>
		</li>
		<li>
			<a href="http://chaping.github.io/plupload/doc/">Plupload文档</a>
		</li>
	</ul>
	<script>
		var uploader = new plupload.Uploader({ //实例化一个plupload上传对象
			browse_button : 'browse',
			url : '<%=path%>/file/fileUploadAction/upload.action',
			flash_swf_url : 'js/Moxie.swf',
			silverlight_xap_url : 'js/Moxie.xap',
		});
		uploader.init(); //初始化

		//绑定文件添加进队列事件
		uploader
				.bind(
						'FilesAdded',
						function(uploader, files) {
							for (var i = 0, len = files.length; i < len; i++) {
								var file_name = files[i].name; //文件名
								//构造html来更新UI
								var html = '<li id="file-' + files[i].id +'"><p class="file-name">'
										+ file_name
										+ '</p><p class="progress"></p></li>';
								$(html).appendTo('#file-list');
							}
						});

		//绑定文件上传进度事件
		uploader.bind('UploadProgress', function(uploader, file) {
			$('#file-' + file.id + ' .progress').css('width',file.percent + '%');//控制进度条
		});

		//上传按钮
		$('#upload-btn').click(function() {
			uploader.start(); //开始上传
		});
	</script>
</body>
</html>