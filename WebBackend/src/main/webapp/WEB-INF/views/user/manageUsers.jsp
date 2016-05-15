<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link rel="stylesheet" href="<c:url value='/css/main.css'/>"/>

<div id="container">
	<div style="width: 800px; margin: auto;">
		<table>
			<tr style="font-weight: bold; background-color: #C6C6C4;">
				<td>Email</td>
				<td>First Name</td>
				<td>Last Name </td>
			</tr>
			<c:if test="${!empty users}">
			<c:forEach items="${users}" var="user">
				<tr bgcolor="#E1E1E1">
					<td>${user.email}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td><a href="<c:url value='editProduct.htm?id=${user.userId}'/>"> Edit</a>
						<a href="<c:url value='deleteProduct.htm?id=${user.userId}'/>">/ Delete</a>
						</td>
				</tr>

			</c:forEach>
			</c:if>
		</table>
		<p>
			<a href="${pageContext.request.contextPath}/user/create">add more Users</a>
		</p>
	</div>
</div>