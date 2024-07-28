<%-- 
    Document   : Application
    Created on : 16 Apr, 2023, 8:07:43 PM
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
            application.setAttribute("User", "Admin");
            out.println("Attribute User : "+application.getAttribute("User"));
            out.println("Param-Value of user : "+application.getInitParameter("user"));
            %>
    </body>
</html>
