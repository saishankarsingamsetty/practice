<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>



<frm:form action="register" modelAttribute="user">

<frm:input path="name"/>

<frm:input path="age"/>

<input type="submit" value="register">



</frm:form>