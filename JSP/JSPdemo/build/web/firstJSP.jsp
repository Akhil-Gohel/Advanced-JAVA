<%-- 
    Document   : firstJSP
    Created on : 16 Apr, 2023, 7:19:45 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Expression JSP tag</h1>
        Time : <%= java.util.Calendar.getInstance().getTime() %>
        
        <h1>Declaration JSP tag</h1>
        <%! int a=5; %>
        <%= "value of a is "+a %>
        <br><br>
        
        <%-- This is JSP comment tag --%>
        
        Date : <%= new Date() %>
    </body>
</html>
