<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<link rel="stylesheet" href="<c:url value='/css/main.css'/>"/>

<div id="container">
	Hello
	
	<a href="${pageContext.request.contextPath}/manageUser">Manage Users</a>
</div>