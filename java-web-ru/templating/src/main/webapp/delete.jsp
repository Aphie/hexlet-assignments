<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- BEGIN -->
<html>
    <head>
        <meta charset="UTF-8">
        <title>User</title>
    </head>
    <body>
            <p><b>Do you really want to delete ${firstName} ${lastName}?</b></p>
            <form method = "post" action='/users/delete?id=${id}' >
                <button type="submit" class="btn btn-danger">Delete user</button>
            </form>
    </body>
</html>
<!-- END -->
