<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Datos</title>
	</head>
	<body>
		<s:form action="saludoUsuario">
			<s:textfield label="Nombre" name="nombre" />
			<s:textfield label="Número de la suerte" name="numero" />
			<s:submit value="Enviar" />
		</s:form>
	</body>
</html>