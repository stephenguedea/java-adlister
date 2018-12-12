<%@ page import="com.sun.org.apache.xpath.internal.operations.String" %><%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/10/18
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
//    for(int i=1; i<=5; i++){
//        out.println("<br/>I really luv2code" + i);
//    }
%>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<%--<h1>Random number: <%= i %></h1>--%>
    <h3>Hello World of Java!</h3>


    The time on the server is <%= new java.util.Date()%>

    Converting a string to uppercase: <%= new java.lang.String("Hello World").toUpperCase()%>
    <br/>
    25 X 4 = <%= 25*4 %>
    <br/>
    Is 75 less than 60? <%= 75 < 60 %>
</body>
</html>
