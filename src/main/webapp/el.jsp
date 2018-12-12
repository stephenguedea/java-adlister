<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/10/18
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // setting request attribute (this would normally be done in a servlet)
    request.setAttribute("userRole", "admin" );

    String message;
    switch (request.getAttribute("userRole").toString()) {
        case "admin":
            message = "administrator";
            break;
        case "s_admin":
            message = "super administrator";
            break;
        case "user_1":
            message = "active user";
            break;
        default:
            message = "unknown status";
    }
    request.setAttribute("userRoleMessage", message);
%>
<html>
<head>
    <title>Expression Language</title>
</head>
<body>
    <h1>Your name is: ${param.name}</h1>

    "user"
    <h2>Username = ${user.username}</h2>
    <p>User Age = ${user.age}</p>
    <p>User Email = ${user.email}</p>

    <h3>User status: ${userRoleMessage}</h3>
</body>
</html>
