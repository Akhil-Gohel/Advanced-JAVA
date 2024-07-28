<%-- 
    Document   : CoreTags
    Created on : 20 Apr, 2023, 9:16:47 PM
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
        <h3>Out tag : used to display on browser</h3>
        <c:out value="Name : ${param.t1}"/>
        
        </br></br>
        <h3>Set tag : used to set variable</h3>
        <c:set var="s" value="${param.subject}"/>
        <c:out value="You selected : ${s}" />
        
        </br></br>
        <h3>If tag : if condition</h3>
        <c:if test="${s == 'cn'}">
            <c:out value="You are in semester 4." />
        </c:if>
        <c:if test="${s == 'ajava'}">
            <c:out value="You are in semester 6." />
        </c:if>
        <c:if test="${s == 'python'}">
            <c:out value="You are in semester 5." />
        </c:if>
        
        <br><br>
        <h3>Choose When, Otherwise tags : used to make if else statement</h3>
        
        <c:choose>
            <c:when test="${param.num == 0}">
                <c:out value="${param.num} is 0."/>
            </c:when>
            
            <c:when test="${param.num%2 == 0}">
                <c:out value="${param.num} is even."/>
            </c:when>
            
            <c:otherwise>
                <c:out value="${param.num} is odd."/>
            </c:otherwise>
        </c:choose>
        
        <br><br>
        <h3>forEach tag is used to make for loop</h3>
        <c:forEach var="j" begin="1" end="4">
            <c:out value="${j}"/><br>
        </c:forEach>
            
        <br>
        <h3>forTokens tag is used to make array of elements</h3>
        <c:forTokens items="apple, banana, mango" delims="," var="f">
            <c:out value="${f}"/><br>
        </c:forTokens>
           
        <br>
        <h3>url tag : used to make url</h3>
        <c:url value="newjsp.jsp" var="udemo">
            <c:param name="user" value="admin"/>
            <c:param name="password" value="pwd"/>
        </c:url>
        ${udemo}
        <br>
        
        <a href="${udemo}">Go to newjsp</a>
        
    </body>
</html>
