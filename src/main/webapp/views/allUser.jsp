<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User</title>
    </head>
    <body>
        <h1>All Users:</h1>
        <c:forEach items="${userList}" var="u">
            <ul>
                <li>${u.name}</li>
                <li>${u.age}</li>
                <li>${u.email}</li>
            </ul>
        </c:forEach>
        <a href="${pageContext.request.contextPath}">Return</a>
    </body>
</html>