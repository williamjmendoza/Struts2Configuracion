<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Carga de archivos</title>
	</head>
	<body>
		<h1>Carga de archivos</h1>
		Nombre: <s:property value="nombre" /><br />
		Ruta: <s:property value="ruta" /><br />
		Autor: <s:property value="autor"/><br />
		Content type: <s:property value="archivoContentType"/>
	</body>
</html>