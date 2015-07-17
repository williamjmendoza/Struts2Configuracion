<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Datos de usuario MD</title>
	</head>
	<body>
		<h1>Datos usuario Model Driven</h1>
		Nombre: <strong><s:property value="nombre"/></strong><br />
		Username: <strong><s:property value="username"/></strong><br />
		Password: <strong><s:property value="password"/></strong><br />
		Edad: <strong><s:property value="edad"/></strong><br />
		Fecha de Nacimiento: <strong><s:property value="fechaNacimiento"/></strong><br />
		Número de Confirmación: <strong><s:property value="numero"/></strong><br />
	</body>
</html>