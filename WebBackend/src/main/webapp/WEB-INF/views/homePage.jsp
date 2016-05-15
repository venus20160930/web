<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<link rel="stylesheet" href="<c:url value='/css/main.css'/>"/>

<div id="container">
	Hello
	
	<a href="${pageContext.request.contextPath}/login">Redirect to Login Page</a>
	
	
	<c:url value="/logout" var="logoutUrl" />
		<form id="logout" action="${logoutUrl}" method="post" >
  			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
		    <a href="javascript:document.getElementById('logout').submit()">Logout</a>
		</c:if>
		
		
	<a href="${pageContext.request.contextPath}/manageUser">Manage Users</a>
</div>