<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link rel="stylesheet" href="<c:url value='/css/main.css'/>"/>

<div>
	<h2>Login Form</h2>
	
	<c:if test="${not empty error}"><div style="color: red;">${error}</div></c:if>
    <c:if test="${not empty message}"><div>${message}</div></c:if>
	
	<form action="<c:url value='/login' />" method="post">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	<table>
		<tr>
			<td><spring:message code="user.email"/></td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td><spring:message code="user.password"/></td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr colspan="2">
			<td><input type="submit" value="<spring:message code="btn.signIn"/>" /></td>
		</tr>
	</table>
	</form>
</div>
<div><a href="<c:url value='/auth/facebook' />">Sign in with Facebook</a></div>
<div><a href="<c:url value='/auth/google' />">Sign in with Google</a></div>