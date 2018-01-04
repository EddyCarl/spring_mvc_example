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

    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>

</head>
<body>

<h1>GOAL PAGE</h1>

<p>Here is some text on the goal page!</p>

<form:form modelAttribute="goal">
    <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td>Enter Minutes:</td>
            <td><form:input path="minutes" /></td>
            <td><form:errors path="minutes" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter goal minutes" />
            </td>
        </tr>
    </table>

</form:form>

</body>
</html>
