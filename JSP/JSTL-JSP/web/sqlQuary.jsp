<%-- 
    Document   : sqlQuary
    Created on : 2 May, 2023, 5:29:02 PM
    Author     : Akhil Gohel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <sql:setDataSource var="db"
                           driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/student_db"
                           user="root"
                           password=""/>
        <sql:query var="rs" dataSource="${db}">
            select * from stud_info;
        </sql:query>
            
            <table border="2">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>div</th>
                </tr>
                
                <c:forEach var="table" items="${rs.rows}">
                    <tr>
                        <td><c:out value="${table.id}"/></td>
                        <td><c:out value="${table.name}"/></td>
                        <td><c:out value="${table.division}"/></td>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
