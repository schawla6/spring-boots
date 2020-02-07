<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>

<title>Company Home Page</title>
</head>
<body>
<h2>Company Home Page</h2>
<hr>
<p>
Welcome to Company's Home Page
</p>
<hr>
<!-- display username and role -->

<p>
User: <security:authentication property="principal.username" />
<br><br>
Role(s): <security:authentication property="principal.authorities" />
</p>
<hr>
<!-- Add a link to point to /leaders ... this is for managers -->
<security:authorize access="hasRole('MANAGER')">

<p>
	<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
	(Only for manager peeps)
</p>
</security:authorize>
<!-- Add a link to point to /systems ...this is for admins -->
<security:authorize access="hasRole('ADMIN')">
<p>
	<a href="${pageContext.request.contextPath}/systems">Systems Meeting</a>
	(Only for admin peeps)
</p>
</security:authorize>
<hr>
<!-- Add a logout button -->
<form:form action="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="Logout" />

</form:form>
</body>
</html>