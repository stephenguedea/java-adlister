<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/11/18
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Products</title>
</head>
<body>
    <h1>Products</h1>
    <c:forEach items="${products}" var="product">
    <div>
        <h3>Product name: ${product.name}</h3>
        <h4>Price: ${product.price}</h4>
        <p>${product.description}</p>
    </div>
    </c:forEach>

</body>
</html>
