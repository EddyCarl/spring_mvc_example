<%--
  Created by IntelliJ IDEA.
  User: Carl.Edmunds
  Date: 04/01/2018
  Time: 09:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Goal</title>
</head>
<body>

<h1>GOAL PAGE</h1>

<p>Here is some text on the goal page!</p>

<form:form modelAttribute="goal">

    <table>
        <tr>
            <td>Enter Minutes:</td>
            <td><form:input path="minutes" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter goal minutes" />
            </td>
        </tr>
    </table>

</form:form>

</body>
</html>
