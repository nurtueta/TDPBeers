<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Hello, world!</title>
  </head>
  <body>
    <s:form action="Agregar" namespace="/">
		<table>
			<s:textfield name="cerveceria.nombre" label="Nombre: "/>
			<s:textfield name="cerveceria.direccion" label="Direccion: "/>
			<s:textfield name="cerveceria.mejorVariedad" label="Variedad: "/>
			<s:textfield name="cerveceria.puntaje" label="Puntaje: "/>
			<s:textarea name="cerveceria.desc" label="Descripcion: "/>
			<tr><td><s:submit value="Agregar"/></td></tr>
		</table>
	</s:form>
	<s:form action="Administrador" namespace="/">
		<s:submit value="Cancelar"/>
	</s:form>
 </body>
</html>