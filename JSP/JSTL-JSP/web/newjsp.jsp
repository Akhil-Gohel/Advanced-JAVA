<%-- 
    Document   : newjsp
    Created on : 22 Apr, 2023, 8:49:59 PM
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
        User : <%= request.getParameter("user")%><br>
        Password : <%= request.getParameter("password") %>
    </body>
</html>
