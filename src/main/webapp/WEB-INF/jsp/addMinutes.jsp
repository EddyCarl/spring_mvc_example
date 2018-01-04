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

    <script type="text/javascript" src="jquery-3.2.1.js"></script>

    <script type="text/javascript">

        $(document).ready(
            function() {
                $.getJSON('<spring:url value="activities.json"/>', {
                    ajax : 'true'
                }, function(data) {
                    var html = '<option value="">--Please select one--</option>';
                    var len = data.length;
                    for(var i = 0; i < len; i++)
                    {
                        html += '<option value="' + data[i].description + '">' + data[i].description + '</option>';
                    }
                    html += '</option>';

                    $('#activities').html(html);
                });
            });

    </script>
</head>
<body>

<h1>Welcome to the Add Minutes page</h1>

<p>Let's throw some text up on the screen too!</p>

Languauge : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>

<form:form modelAttribute="exercise">
    <table>
        <tr>
            <td><spring:message code="goal.text" /></td>
            <td><form:input path="minutes"/></td>
            <td>
                <form:select id="activities" path="activity" > </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter exercise">
            </td>
        </tr>
    </table>
</form:form>

<h2>Goal for the day: ${goal.minutes}</h2>

</body>
</html>
