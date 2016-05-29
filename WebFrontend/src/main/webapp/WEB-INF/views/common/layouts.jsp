<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<!-- <head>
		<title><tiles:getAsString name="title" /></title>
	</head>
	 -->
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
		<link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,600,300,700&subset=vietnamese,latin-ext" rel="stylesheet" type="text/css">
		<link href='https://fonts.googleapis.com/css?family=Roboto:400,700,300,500&subset=vietnamese,latin-ext' rel='stylesheet' type='text/css'>
		<link href="assets/fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
		<link href="assets/libraries/owl-carousel/owl.carousel.css" rel="stylesheet" type="text/css">
		<link href="assets/libraries/chartist/chartist.min.css" rel="stylesheet" type="text/css">
		<link href="assets/css/leaflet.css" rel="stylesheet" type="text/css">
		<link href="assets/css/leaflet.markercluster.css" rel="stylesheet" type="text/css">
		<link href="assets/css/leaflet.markercluster.default.css" rel="stylesheet" type="text/css">
		<link href="assets/css/villareal-blue.css" rel="stylesheet" type="text/css" id="css-primary">
		<link href="assets/css/villareal-fix.css" rel="stylesheet" type="text/css">
		<link rel="shortcut icon" type="image/x-icon" href="assets/favicon.png">
		<title>tokien.vn - Sàn giao dịch bất động sản</title>
	</head>
	 
	<body class="cover-pull-top header-transparent">
		<div class="page-wrapper">
			<!-- check header in here -->
			<tiles:insertAttribute name="header" />
			<!-- end insert header -->
			<div class="main-wrapper">
				<div class="main">
					<tiles:insertAttribute name="body" />
				</div>
				<!-- /.main -->
			</div>
			<!-- /.main-wrapper -->
			<!-- insert footer here -->
			<tiles:insertAttribute name="footer" />
		</div>
		<!-- /.page-wrapper -->
		<div class="customizer">
		<div class="customizer-content">
			<h2>Color Variant</h2>
			<ul>
				<li><a href="assets/css/villareal-turquoise.css" class="background-turquoise"></a></li>
				<li><a href="assets/css/villareal-orange.css" class="background-orange"></a></li>
				<li><a href="assets/css/villareal-orange-dark.css" class="background-orange-dark"></a></li>
				<li><a href="assets/css/villareal-purple.css" class="background-purple"></a></li>
				<li><a href="assets/css/villareal-cyan.css" class="background-cyan"></a></li>
				<li><a href="assets/css/villareal-teal.css" class="background-teal"></a></li>
				<li><a href="assets/css/villareal-magenta.css" class="background-magenta"></a></li>
				<li><a href="assets/css/villareal-green.css" class="background-green"></a></li>
				<li><a href="assets/css/villareal-green-dark.css" class="background-green-dark"></a></li>
				<li><a href="assets/css/villareal-red.css" class="background-red"></a></li>
				<li><a href="assets/css/villareal-brown.css" class="background-brown"></a></li>
				<li><a href="assets/css/villareal-blue.css" class="background-blue"></a></li>
				<li><a href="assets/css/villareal-blue-gray.css" class="background-blue-gray"></a></li>
				<li><a href="assets/css/villareal-yellow.css" class="background-yellow"></a></li>
			</ul>
		</div>
		<!-- /.customizer-content -->
		<!--
			<div class="customizer-title">
				<span><i class="fa fa-cog"></i> Customizer</span>
			</div><!-- /.customizer-title -->
		<!--</div><!-- /.customizer -->
		<script src="//maps.googleapis.com/maps/api/js" type="text/javascript"></script>
		<script type="text/javascript" src="assets/js/jquery.js"></script>
		<!--<script type="text/javascript" src="assets/js/jquery.ezmark.min.js"></script>-->
		<script type="text/javascript" src="assets/js/tether.min.js"></script>
		<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="assets/js/gmap3.min.js"></script>
		<script type="text/javascript" src="assets/js/leaflet.js"></script>
		<script type="text/javascript" src="assets/js/leaflet.markercluster.js"></script>
		<script type="text/javascript" src="assets/libraries/owl-carousel/owl.carousel.min.js"></script>
		<script type="text/javascript" src="assets/libraries/chartist/chartist.min.js"></script>
		<script type="text/javascript" src="assets/js/scrollPosStyler.js"></script>
		<script type="text/javascript" src="assets/js/villareal.js"></script>
	</body>
</html>