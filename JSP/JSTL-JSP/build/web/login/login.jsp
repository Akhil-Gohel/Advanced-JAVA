<%-- 
    Document   : login
    Created on : 22 Apr, 2023, 9:06:14 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <c:choose>
            <c:when test="${param.uname == 'admin' && param.pwd == 'password'}">
                <c:redirect url="data.html"/>
            </c:when>
            <c:otherwise>
                <c:redirect url="index.html"/>
            </c:otherwise>
        </c:choose>
    </body>
</html>
