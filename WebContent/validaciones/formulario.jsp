<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Validaciones</title>
	</head>
	<body>
		<h1>Validaciones</h1>
		<s:fielderror />
		<s:actionerror/>
		<s:form action="validacionDatos">
			<s:textfield name="nombre" label="Nombre" requiredLabel="true" />
			<s:textfield name="username" label="Username" requiredLabel="true" />
			<s:password name="password" label="Password" requiredLabel="true" />
			<s:textfield name="email" label="Email" requiredLabel="true" />
			<s:textfield name="edad" label="Edad" requiredLabel="true" />
			<s:textfield name="telefono" label="Teléfono" />
			<s:submit value="Enviar" />
		</s:form>
	</body>
</html>