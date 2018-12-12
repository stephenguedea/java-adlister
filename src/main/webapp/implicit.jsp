<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/10/18
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Random r = new Random();
    int randomNum = r.nextInt((7 -1) + 1) +1;
    if (randomNum == 1 ) {
        response.sendRedirect("/count");
    } else if (randomNum == 7){
        response.sendError(500);
    }
    String textColor = (request.getParameter("color") != null) ? request.getParameter("color") : "";

%>

<html>
<head>
    <title>Implicit Object Example</title>
</head>
<body>
    <%--<h1>Welcome To The Site!</h1>--%>
    <%--<p>Path: <%= request.getRequestURL() %></p>--%>
    <%--<p>Query String: <%= request.getQueryString() %></p>--%>
    <%--<p>"name" parameter: <%= request.getParameter("name") %></p>--%>
    <%--<p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>

    <h1>Random number: <%= randomNum %></h1>
    <h3 style="color:<%= textColor %>">Some color</h3>
    <%--<p><% out.print("THIS IS A DEMO OF OUT"); %></p>--%>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>
</body>
</html>
