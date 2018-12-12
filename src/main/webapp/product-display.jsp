<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/11/18
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Display</title>
</head>
<body>
    <c:choose>
        <c:when test="${product != null}">
            <h1>Product name: ${product.name}</h1>
            <h3>Price: ${product.price}</h3>
            <p>${product.description}</p>
        </c:when>
        <c:otherwise>
            <h1>No product found</h1>
        </c:otherwise>
    </c:choose>



</body>
</html>
