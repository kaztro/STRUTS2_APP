<%-- 
    Document   : login
    Created on : 04-10-2023, 09:15:11 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <s:form method="POST" action="login">
            <s:textfield name="nombre" label="Introduzca el nombre" />
            <s:password name="password" label="Introduzca la contraseña" />
            <s:submit name="enviar" value="Enviar" />
        </s:form>
    </body>
</html>
