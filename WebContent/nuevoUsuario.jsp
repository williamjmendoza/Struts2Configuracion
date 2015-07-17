<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Nuevo Usuario</title>
	</head>
	<body>
		<h1>Nuevo usuario</h1>
		<s:form action="datosUsuario">
			<s:textfield name="nombre" label="Nombre" />
			<s:textfield name="username" label="Username" />
			<s:password name="password" label="Password" />
			<s:textfield name="edad" label="Edad" />
			<s:textfield name="fechaNacimiento" label="Fecha de nacimiento" />
			<s:submit value="Enviar" />
		</s:form>
	</body>
</html>