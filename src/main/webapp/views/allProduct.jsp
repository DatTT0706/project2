<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product</title>
    </head>
    <body>
        <h1>All Products:</h1>
        <c:forEach items="${productList}" var="p">
            <ul>
                <li>${p.name}</li>
                <li>${p.price}</li>
            </ul>
        </c:forEach>
        <a href="${pageContext.request.contextPath}">Return</a>
    </body>
</html>