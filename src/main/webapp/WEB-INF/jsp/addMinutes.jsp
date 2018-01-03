<%--
  Created by IntelliJ IDEA.
  User: Carl.Edmunds
  Date: 03/01/2018
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Add Minutes Page</title>
</head>
<body>

<h1>Welcome to the Add Minutes page</h1>

<p>Let's throw some text up on the screen too!</p>

<form:form modelAttribute="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text" /></td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter exercise">
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
