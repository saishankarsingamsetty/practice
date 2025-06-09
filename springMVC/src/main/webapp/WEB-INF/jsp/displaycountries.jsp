<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form action="printcountry" method="post">
    <label>Select Country:</label>
    <select name="country">
        <c:forEach items="${countries}" var="country">
            <option value="${country}">${country}</option>
        </c:forEach>
    </select>
    <br/><br/>
    <input type="submit" value="Submit"/>
</form>