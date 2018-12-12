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
    <title>Adlister | Ads</title>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>

<body>
<jsp:include page="../partials/navbar.jsp" />
    <div class="container">
        <table class="table">

                <%--<div class="ads">--%>
                    <%--<h2>Titles: ${ad.title}</h2>--%>
                    <%--<p>Description: ${ad.description}</p>--%>
                    <%--<p>Ad ID: ${ad.id}</p>--%>
                    <%--<p>UserID: ${ad.userId}</p>--%>
                <%--</div>--%>
                <thead>
                <tr>

                    <th scope="col">Title</th>
                    <th scope="col">Description</th>
                    <th scope="col">Ad ID</th>
                    <th scope="col">User ID</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="ad" items="${ads}">

                <tr>

                    <td scope="row">${ad.title} </td>
                    <td>${ad.description}</td>
                    <td>${ad.id}</td>
                    <td>${ad.userId}</td>

                </tr>
                </c:forEach>
                </tbody>

        </table>
    </div>
</body>
</html>
<%-- this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;--%>