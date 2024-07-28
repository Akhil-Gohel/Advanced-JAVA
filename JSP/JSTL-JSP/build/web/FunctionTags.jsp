<%-- 
    Document   : FunctionTags
    Created on : 24 Apr, 2023, 11:48:22 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Hi this is engineering institute</p>
        <h1>contains</h1>
        <c:set var="s" value="Hi this is engineering institute"/>
        <c:if test="${fn:contains(s,'engineering')}">
            <p>engineering found</p>
        </c:if>
            
        <h1>containsIgnoreCase</h1>
        <c:set var="s" value="Hi this is ENgineeRing institute"/>
        <c:if test="${fn:containsIgnoreCase(s,'engiNeerinG')}">
            <p>engineering found</p>
        </c:if>
        
        <h1>endsWith</h1>
        <c:set var="s" value="Hi this is engineering institute"/>
        <c:if test="${fn:endsWith(s,'institute')}">
            <p>Ends with institute</p>
        </c:if>
            
        <h1>startsWith</h1>
        <c:set var="s" value="Hi this is engineering institute"/>
        <c:if test="${fn:startsWith(s,'Hi')}">
            <p>Starts with Hi</p>
        </c:if>
            
        <h1>indexOf</h1>
        <p>Index of "eering" : ${fn:indexOf(s,"eering")}</p>
        
        <h1>trim</h1>
        <c:set var="s1" value="     This is String      "/>
        Length before trim : ${fn:length(s1)}<br>
        <c:set var="s2" value="${fn:trim(s1)}"/>
        Length before trim : ${fn:length(s2)}<br>
        Final string ${s2}
        
        <h1>toLowerCase</h1>
        ${fn:toLowerCase('HELLO')}
        
        <h1>toUpperCase</h1>
        ${fn:toUpperCase('hello')}
        
        <h1>split & join</h1>
        <c:set var="s1" value="Hi-this-is-engineering-institute"/>
        <c:set var="s2" value="${fn:split(s1,'-')}"/>
        <c:set var="s3" value="${fn:join(s2,' ')}"/>
        <c:set var="s4" value="${fn:join(s2,'')}"/>
        <p>Splited String : ${s2}</p>
        <p>Final String : ${s3}</p>
        <p>Final String : ${s4}</p>
    </body>
</html>
