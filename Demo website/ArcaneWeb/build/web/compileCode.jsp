<%-- 
    Document   : compileCode
    Created on : Jul 9, 2016, 11:07:19 AM
    Author     : Tom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:useBean id="CodeBean" scope="session" class="com.mycompany.arcane.StoreCode" />
        <jsp:setProperty name="CodeBean" property="inputCode" />
        
        <h1>This is your the code: <jsp:getProperty name="CodeBean" property="inputCode" /></h1>
        <h1>Output for code: <jsp:getProperty name="CodeBean" property="outputCode" /></h1>
        
    </body>
</html>
