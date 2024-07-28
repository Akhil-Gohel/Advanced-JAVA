<%-- 
    Document   : XmlTags
    Created on : 2 May, 2023, 5:39:35 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:import var="stu" url="Student.xml"/>
        <x:parse xml="${stu}" var="output"/>
        
        <b>Name:</b>
        <x:out select="$output/class/student[1]/name"/><br>
        <x:if select="$output/class/student[1]/name='SPO'">
            Branch is CE
        </x:if>
    </body>
</html>
