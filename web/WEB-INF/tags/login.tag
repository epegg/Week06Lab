<%-- 
    Document   : login
    Created on : Oct 11, 2018, 12:26:37 PM
    Author     : 752814
--%>

<%@tag description="login form" pageEncoding="UTF-8"%>
<%@attribute name="message"%>

<form name="login" action="login" method="post">
            <h2>Login Page</h2>
            <div style="color: red;">${message}</div>
            Username: <input type="text" name="username" value="${username}" /><br/>
            Password: <input type="password" name="password" value="${password}" /><br/>
            <input type="checkbox" name="rememberMe" ${rememberMe}>Remember me</input><br/>
            <input type="submit" value="Submit">
            
</form>