<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link rel="stylesheet" href="<c:url value='/css/main.css'/>"/>

<div id="container">
	<h3>Create User</h3>
	<form:form method="post" modelAttribute="user">
	<table>
		<tr>
			<td><spring:message code="user.email"/></td>
			<td>
				<form:input type="text" path="email" id="Email" />
                <form:errors path="email" />
			</td>
		</tr>
		<tr>
			<td><spring:message code="user.password"/></td>
			<td>
				<form:input type="password" path="password" id="password" />
				<form:errors path="password" />
			</td>
		</tr>
		<tr>
			<td><spring:message code="user.confirmPassword"/></td>
			<td><form:input type="password" path="confirmPassword" id="confirmPassword" /></td>
		</tr>
		<tr>
			<td><spring:message code="user.firstName"/></td>
			<td><form:input type="text" path="firstName" id="firstName" /></td>
		</tr>
		<tr>
			<td><spring:message code="user.lastName"/></td>
			<td><form:input type="text" path="lastName" id="lastName" /></td>
		</tr>
		<tr>
			<td><spring:message code="user.phone"/></td>
			<td><form:input type="text" path="phone" id="phone" /></td>
		</tr>
			
		<tr colspan="2">
			<td><input type="submit" value="<spring:message code="btn.signUp"/>" /></td>
		</tr>
	</table>
	</form:form>
</div>