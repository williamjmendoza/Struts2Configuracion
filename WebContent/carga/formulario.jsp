<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Carga</title>
	</head>
	<body>
		<h1>Carga de archivos</h1>
		<s:actionerror/>
		<s:form enctype="multipart/form-data" action="cargaArchivo" method="post">
			<s:file name="archivo" label="Archivo" />
			<s:textfield name="autor" label="Autor" />
			<s:submit value="Enviar"></s:submit>
		</s:form>
	</body>
</html>