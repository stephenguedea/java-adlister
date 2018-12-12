<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/11/18
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="ad" items="${ads}">
        <div class="ads">
            <h2>Titles: ${ad.title}</h2>
            <p>${ad.description}</p>
            <%--<p>${ad.id}</p>--%>
            <%--<p>${ad.userId}</p>--%>
        </div>
    </c:forEach>
</body>
</html>
<%-- this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;--%>