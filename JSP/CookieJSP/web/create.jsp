<%-- 
    Document   : create
    Created on : 17 Apr, 2023, 9:39:37 PM
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
            String name = request.getParameter("name");
            Cookie c = new Cookie("user",name);
            response.addCookie(c);
            out.println("Cookie Created");
            %>
            <a href="read.jsp">READ</a>
    </body>
</html>
