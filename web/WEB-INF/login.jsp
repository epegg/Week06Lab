<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <%@taglib prefix="sait1" tagdir="/WEB-INF/tags/"%>
        <%@taglib prefix="sait" uri="/WEB-INF/tlds/sait"%>
        <title>My Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <sait:debug>Remote Host: ${pageContext.request.remoteHost}<br />Session ID: ${pageContext.session.id}</sait:debug>
        <sait1:login></sait1:login>
    </body>
</html>
