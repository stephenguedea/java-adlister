<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/11/18
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Here are all the tools:</h1>

<c:forEach var="tool" items="${ads}">
<div class="tool">
    <h2>${ads.name}</h2>
    <p>Price: $ ${ads.price}</p>
</div>
</c:forEach>
</html>
