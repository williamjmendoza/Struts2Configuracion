<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Stack</title>
	</head>
	<body>
	
		<h1>Valores de propiedades en el ValueStack</h1>
		<ul>
			<li><strong>Raza: </strong><s:property value="raza"/></li>
			<li><strong>Salario: </strong><s:property value="salario"/></li>
			<li><strong>Nombre: </strong><s:property value="nombre"/></li>
		</ul>
		
		<ul>
			<li><strong>Animal: </strong><s:property value="[0].nombre"/></li>
			<li><strong>Persona: </strong><s:property value="[1].nombre"/></li>
		</ul>
	</body>
</html>