<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/11/18
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Tools</title>
</head>
<body>
    <h1>Here are all the tools:</h1>

    <c:forEach var="tool" items="${tools}">
        <div class="tool">
            <h2>${tool.name}</h2>
            <p>Price: $ ${tool.price}</p>
        </div>
    </c:forEach>
</body>
</html>
