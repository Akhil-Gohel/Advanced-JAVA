<%-- 
    Document   : requestObject
    Created on : 16 Apr, 2023, 7:50:22 PM
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
            out.println("Hello "+name);
            %>
    </body>
</html>
