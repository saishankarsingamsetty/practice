<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<h2>Student Registration</h2>
<form:form modelAttribute="student" method="post" action="regstud">

   <%--  ID: <form:input path="id" /><form:errors path="id"/><br/> --%>
    Name: <form:input path="name"/><form:errors path="name"/><br/>
    Email: <form:input path="email"/><form:errors path="email"/><br/>
    Age: <form:input path="age" type = "number" /><form:errors path="age"/><br/>

    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
