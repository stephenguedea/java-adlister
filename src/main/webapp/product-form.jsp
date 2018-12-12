<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/11/18
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name Form</title>
</head>
<body>

    <h1>Product Form</h1>
    <form action="/create-product" method="post">
        <input type="text" name="name" placeholder="Enter product name">
        <br>
        <input type="number" name="price" placeholder="Enter product price">
        <br>
        <textarea name="description" id="description" cols="30" rows="10" placeholder="Please enter product description"></textarea>
        <br>
        <button>Submit</button>
    </form>



</body>
</html>
