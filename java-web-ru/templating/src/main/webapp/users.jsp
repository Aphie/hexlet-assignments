<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- BEGIN -->
<%@page contentType="text/html" pageEncoding="UTF-8" language = "java"%>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Users</title>
    </head>
    <body>
        <c:forEach var="user" items="${users}">
            <table width="60%">
            <tr>
                <td width =30>${user.get("id")}</td>
                <td width = 100><a href='/users/show?id=${user.get("id")}'>${user.get("firstName")} ${user.get("lastName")}</td>
            </tr>
            </table>
        </c:forEach>
    </body>
</html>
<!-- END -->
