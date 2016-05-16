<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<div>Wellcome Header</div>
<div>-------------------------------------------</div>
<div>

	<c:if test="${pageContext.request.userPrincipal.name == null}">
	<a href="${pageContext.request.contextPath}/login">Redirect to Login Page</a>
	</c:if>
	
	<c:url value="/logout" var="logoutUrl" />
		<form id="logout" action="${logoutUrl}" method="post" >
  			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
		    <a href="javascript:document.getElementById('logout').submit()">Logout</a>
		</c:if>
</div>