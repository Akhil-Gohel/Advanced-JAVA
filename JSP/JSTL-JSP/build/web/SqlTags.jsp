<%-- 
    Document   : SqlTags
    Created on : 25 Apr, 2023, 12:12:38 AM
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
        <sql:setDataSource var="db"
                           driver="com.mysql.jdbc.Driver"
                           url="jdbc:mysql://localhost:3306/student_db"
                           user="root"
                           password=""/>
        <sql:update dataSource="${db}" var="c1">
            insert into stud_info values(121,'SPO','C');
        </sql:update>
            Values Inserted<br>
            
        <c:set var="sid" value="121"/>
        <sql:update dataSource="${db}" var="c2">
            delete from stud_info where id=?;
            <sql:param value="${sid}"/>
        </sql:update>
            Values Deleted<br>
            
        <sql:update dataSource="${db}" var="c3">
            insert into stud_info values(?,?,?);
            <sql:param>110</sql:param>
            <sql:param>AMG</sql:param>
            <sql:param>C</sql:param>
        </sql:update>
            All Values Inserted<br>
            
            <sql:transaction dataSource="${db}">
                <sql:update>
                    insert into Stud_info values(121,'SPO','C');
                </sql:update>
                <sql:update>
                    insert into Stud_info values(121,'SPO','C');
                </sql:update>
                <sql:update>
                    insert into Stud_info values(121,'SPO','C');
                </sql:update>
            </sql:transaction>
                    Transaction Completed
    </body>
</html>
