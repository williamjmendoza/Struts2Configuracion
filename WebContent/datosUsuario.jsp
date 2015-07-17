<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Datos de Usuario</title>
	</head>
	<body>
		<h1>Datos usuario</h1>
		Nombre: <strong><s:property value="usuario.nombre"/></strong><br />
		Username: <strong><s:property value="usuario.username"/></strong><br />
		Password: <strong><s:property value="usuario.password"/></strong><br />
		Edad: <strong><s:property value="usuario.edad"/></strong><br />
		Fecha de Nacimiento: <strong><s:property value="usuario.fechaNacimiento"/></strong><br />
	</body>
</html>