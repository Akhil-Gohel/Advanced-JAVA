<%-- 
    Document   : process
    Created on : 22 Apr, 2023, 9:24:27 PM
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
        <c:out value="Name : ${param.name}"/><br>
        <c:out value="You selected : ${param.sub}"/><br>
        <c:choose>
            <c:when test="${param.cpi >= '9'}">
                <c:out value="You are eligible for placements."/>
            </c:when>
            <c:otherwise>
                <c:out value="You are not eligible for placements."/>
            </c:otherwise>
        </c:choose>
    </body>
</html>
