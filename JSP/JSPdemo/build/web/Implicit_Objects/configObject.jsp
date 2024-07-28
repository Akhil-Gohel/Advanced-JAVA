<%-- 
    Document   : configObject
    Created on : 17 Apr, 2023, 11:36:58 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Password : <% out.println(config.getInitParameter("password")); %>
    </body>
</html>
