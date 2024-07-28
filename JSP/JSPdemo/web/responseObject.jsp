<%-- 
    Document   : responseObject
    Created on : 16 Apr, 2023, 7:54:49 PM
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
            Cookie c = new Cookie("user","admin");
            response.addCookie(c);
            out.println("Cookie Name : "+c.getName());
            out.println("<br>");
            out.println("Cookie Value : "+c.getValue());
            %>
    </body>
</html>
