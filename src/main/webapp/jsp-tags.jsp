<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/10/18
  Time: 9:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"></jsp:include>
    <%@ include file="partials/navbar.html"%>

<h1>The current count is <%= counter %>.</h1>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->


</body>
</html>
