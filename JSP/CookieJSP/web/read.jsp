<%-- 
    Document   : read
    Created on : 17 Apr, 2023, 9:49:59 PM
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
            Cookie ck[] = request.getCookies();
            for(Cookie c:ck)
            {
                out.println("Name:"+c.getName()+" "+"Value"+c.getValue());
            }
            %>
            <a href="delete.jsp">DELETE</a>
    </body>
</html>
