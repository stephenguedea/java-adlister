<%--
  Created by IntelliJ IDEA.
  User: stephen.guedea
  Date: 12/10/18
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%--@WebServlet(name = "login", urlPatterns = "/login")--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="partials/login_template.jsp"></jsp:include>
 <html>
        <title>Expression Language</title>
    <head>
        <jsp:include page="partials/head.jsp">
            <jsp:param name="title" value="Please Log In" />
        </jsp:include>
    </head>
    <body>
    <jsp:include page="partials/navbar.jsp" />
    <div class="container bg-success">
        <h1>Please Log In</h1>
        <form action="/login" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>

</body>
</html>
