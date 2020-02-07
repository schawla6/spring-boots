<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<h2>STUDENT FORM</h2>
<hr>
<head>
	<title>Student Registration Form</title>
	<style>
		.error {color:red}
	</style>
</head>

<body>

Enter Student Information. Asterisk (*) is the required field
<br><br>

<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/>

<br><br>
Last Name(*): <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error" />

<br><br>
Zip Code(*): <form:input path="zipCode"/>
<form:errors path="zipCode" cssClass="error" />

<br><br>

Country: <form:select path="country">
<form:options items="${student.countryOptions}"></form:options>
</form:select>

<br><br>

Test Code(*): <form:input path="testCode"/>
<form:errors path="testCode" cssClass="error" />

<br><br>

Language(*):
Java<form:radiobutton path="language" value="Java" />
Python<form:radiobutton path="language" value="Python" />
C#<form:radiobutton path="language" value="C#" />
Ruby<form:radiobutton path="language" value="Ruby" />

<form:errors path="language" cssClass="error" />
<br><br>

Operating System(*):
Linux<form:checkbox path="operatingSystem" value="Linux" />
Mac Os<form:checkbox path="operatingSystem" value="Mac Os" />
MS Windows<form:checkbox path="operatingSystem" value="Windows" />

<form:errors path="operatingSystem" cssClass="error" />
<br><br>

Questions Solved(*): <form:input path="questionSolved"/>
<form:errors path="questionSolved" cssClass="error" />
<br><br>
<input type="submit" value="Submit" />

</form:form>
<br><br><br>

<a href= "../">Go Home</a>


</body>

</html>