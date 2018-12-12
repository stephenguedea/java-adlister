<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/10/18
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
<%--</head>--%>
<%--<body>--%>
<%--<%@include file="partials/login_success_template.jsp"%>--%>
    <%--<%--%>
        <%--String username = request.getParameter("username");--%>
    <%--%>--%>
    <%--<h1>Welcome, <%= username%></h1>--%>
    <%--<br/>--%>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Welcome to my site!" />
</jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class="container bg-success">
    <h1 class="text-center">Welcome to the Adlister!</h1>
</div>


</body>
</html>
