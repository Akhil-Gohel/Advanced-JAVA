<%-- 
    Document   : errorPage
    Created on : 17 Apr, 2023, 10:54:10 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.println(exception);
        %>
    </body>
</html>
