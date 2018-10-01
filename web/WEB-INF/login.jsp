<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>My Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form name="login" action="login" method="post">
            <h2>Login Page</h2>
            <div style="color: red;">${message}</div>
            Username: <input type="text" name="username" value="${username}" /><br/>
            Password: <input type="password" name="password" value="${password}" /><br/>
            <input type="checkbox" name="rememberMe" ${rememberMe}>Remember me</input><br/>
            <input type="submit" value="Submit">
            
        </form>
    </body>
</html>
