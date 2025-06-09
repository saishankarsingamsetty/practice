<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<h1 style = 'text-align : center'>print page </h1>
printing simple values:

name is : <b>${name}</b>	<br>
age is : <b>${age}</b>


<br><br>printing collection values:<br><br>
list values is : ${list}<br>


<!-- <br><br>printing collection values:<br><br> -->
set values is : ${set}<br>


<c:forEach var = "user" items="${set }">
${user }
</c:forEach>

<%-- ${user } --%>

<br>

<c:if test="${not empty user }">
${user.id }
</c:if>