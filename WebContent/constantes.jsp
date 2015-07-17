<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Constantes</title>
	</head>
	<body>
		<h1>Llamadas a Métodos y Conatantes con OGNL</h1>
		<ul>
			<li><s:property value="new com.javatutoriales.struts2.ognl.modelo.Constantes().atributo"/></li>
			<li><s:property value="new com.javatutoriales.struts2.ognl.modelo.Constantes().metodoDeInstancia()" /></li>
			<li><s:property value="new com.javatutoriales.struts2.ognl.Constantes().metodoEstatico()" /></li>
			<li><s:property value="new com.javatutoriales.struts2.ognl.Constantes().valor" /></li>
			<li><s:property value="@com.javatutoriales.struts2.ognl.modelo.Constantes@valor"/></li>
			<li><s:property value="@com.javatutoriales.struts2.ognl.modelo.Constantes@metodoEstatico()" /></li>
			<li><s:property value="@com.javatutoriales.struts2.ognl.modelo.Constantes@metodoEstatico('Hola Amigos Estaticos')" /></li>
			<li><s:property value="new com.javatutoriales.struts2.ognl.modelo.Constantes().metodoDeInstancia('Hola Amigos')" /></li>
			<li><s:property value="new com.javatutoriales.struts2.ognl.modelo.Constantes().metodoDeInstancia(@com.javatutoriales.struts2.ognl.modelo.Constantes@valor)" /></li>
		</ul>
		
		<ul>
			<li><s:property value="@com.javatutoriales.struts2.ognl.modelo.Constantes$Datos@PRIMERO" /></li>
			<li><s:property value="@com.javatutoriales.struts2.ognl.modelo.Constantes$Datos@SEGUNDO" /></li>
			<li><s:property value="@com.javatutoriales.struts2.ognl.modelo.Constantes$Datos@TERCERO.dato" /></li>
		</ul>
		
		<ul>
			<s:property value="new int[]{1, 2, 3, 4, 5}"/>
		</ul>
		
		<s:select name="arreglos" list="new int[]{1, 2, 3, 4, 5}"></s:select>
		
		<ul>
			<li><s:property value="{'uno', 'dos', 'tres', 'cuatro', 'cinco'}"/></li>
		</ul>
		
		<s:select name="listas" list="{'uno', 'dos', 'tres', 'cuatro', 'cinco'}"></s:select>
		
		<ul>
			<li><s:property value="#{'uno':'1', 'dos':'2', 'tres':'3', 'cuatro':'4', 'cinco':'5'}"/></li>
		</ul>
		
		<s:select name="mapas" list="#{'uno':'1', 'dos':'2', 'tres':'3', 'cuatro':'4', 'cinco':'5'}"></s:select>
		
		<ul>
			<li><s:property value="#@java.util.LinkedHashMap@{'uno':'1', 'dos':'2', 'tres':'3', 'cuatro':'4', 'cinco':'5'}" /></li>            
			<li><s:property value="#@java.util.TreeMap@{'uno':'1', 'dos':'2', 'tres':'3', 'cuatro':'4', 'cinco':'5'}" /></li>  
			<li><s:property value="#@java.util.HashMap@{'uno':'1', 'dos':'2', 'tres':'3', 'cuatro':'4', 'cinco':'5'}" /></li>
		</ul>
		
		<ul>
			<li><s:property value="nombre" /></li>
			<li><s:property value="constantes.atributo" /></li>
			<li><s:property value="constantes.metodoDeInstancia()" /></li>
			<li><s:property value="constantes.metodoDeInstancia(nombre)" /></li>
			<li><s:property value="constantes.metodoDeInstancia(constantes.atributo)" /></li>
			<li><s:property value="constantes.metodoEstatico()" /></li>
			<li><s:property value="constantes@valor" /></li>
			<li><s:property value="constantes.valor" /></li>
		</ul>
		
		<ul>
			<li>${nombre}</li>
			<li>${constantes.atributo}</li>
		</ul>
		
		<ul>
			<li><s:select list="persona.familiares.{? #this.genero == 'masculino'}"></s:select></li>
			<li><s:select list="persona.familiares.{nombre}"></s:select></li>
		</ul>
		
		
	</body>
</html>