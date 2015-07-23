<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Multiparametros</title>
		<script type="text/javascript" src="../javascript/lib/jquery/jquery-1.11.3.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function () 
			{
			    $("#btnAgregar").click(function() 
			    {
			        var num = $("input[type=text]").length;
			        var numeroSiguiente = num + 1;
			        var elementoNuevo = $("#valor" + num).clone().attr('id', 'valor'+numeroSiguiente).attr("name", "valor"+numeroSiguiente);
			        var etiquetaNueva = $("label[for=valor"+num+"]").clone().attr("for", "valor"+numeroSiguiente).text("Valor " + numeroSiguiente + ": ");
			                           
			        $("#valor" + num).after(elementoNuevo);
			        elementoNuevo.before(etiquetaNueva);
			        etiquetaNueva.before("<br />");
			    });
			});
		</script>
	</head>
	<body>
		<s:form action="multiparametros" theme="simple">
			<s:label for="valor1" value="Valor1: "/>
			<s:textfield id="valor1" name="valor1"/> <br />
			<s:submit /><br />			
		</s:form>
		<button id="btnAgregar">Agregar Elemento</button>
	</body>
</html>