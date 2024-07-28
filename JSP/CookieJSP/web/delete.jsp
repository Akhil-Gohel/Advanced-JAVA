<%-- 
    Document   : dlete
    Created on : 17 Apr, 2023, 9:54:03 PM
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
        <%
            Cookie c = new Cookie("user","");
            c.setMaxAge(0);
            response.addCookie(c);
            out.println("Cookie Deleted");
        %>
        <a href="read.jsp">READ</a>
    </body>
</html>
