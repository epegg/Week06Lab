<%-- 
    Document   : home
    Created on : Sep 27, 2018, 1:39:41 PM
    Author     : 752814
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <form method="post" action="login">
            <h1>Home</h1>
            Hello ${username}!<br/>
            <a href="home?logout">Logout</a>
        </form>
    </body>
</html>
