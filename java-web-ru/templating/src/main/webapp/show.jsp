<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- BEGIN -->
<%@page contentType="text/html" pageEncoding="UTF-8" language = "java"%>
<html>
    <head>
        <meta charset="UTF-8">
        <title>User</title>
    </head>
    <body>
            <table>
            <tr>
                <td>ID: </td><td>${user.get("id")}</td>
            </tr>
            <tr>
                <td>Firstname: </td><td>${user.get("firstName")}</td>
            </tr>
            <tr>
                <td>Lastname: </td><td>${user.get("lastName")}</td>
            </tr>
            <tr>
                <td>email: </td><td>${user.get("email")}</td>
            </tr>
            </table>
            <a href='/users/delete?id=${user.get("id")}'>Delete ${user.get("firstName")} ${user.get("lastName")}
    </body>
</html>
<!-- END -->
