<%@page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="Informacion.listaCervecerias"%>
<%@page import="Informacion.Cerveceria"%>
<!doctype html>
<html lang="en">
  <head>
 	 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>TDPBeers (Administrador)</title>
  </head>
  <body>
	<s:form action="Index" namespace="/">
		<s:submit value="Regresar"/>
	</s:form>
	<s:form action="PaginaAgregar">
		<s:submit value="Agregar"/>
	</s:form>
	<%
		listaCervecerias l=new listaCervecerias();
			for(Cerveceria cerveza: l.getLista())
			{
	%>
	<s:form action="Editar" namespace="/">
		<table id="listaDeCervezas">
			<img src="<%out.print(cerveza.getImagen());%>" width="200" height="100"/>
			<tr><td>Cerveceria: </td><td><%out.println(cerveza.getNombre());%></td></tr>
			<tr><td>Direccion: </td><td><%out.println(cerveza.getDireccion());%></td></tr>
			<tr><td>Variedad: </td><td><%out.println(cerveza.getMejorVariedad());%></td></tr>
			<tr><td>Puntaje: </td><td><%out.println(cerveza.getPuntaje());%></td></tr>
			<tr><td>Descripcion: </td><td><%out.println(cerveza.getDesc());%></td></tr>
		</table>
		<s:set name="nombre"><%out.println(cerveza.getNombre());%></s:set> 
		<s:hidden name="nombreCerveceria" value="%{nombre}"/>  
		<s:submit value="Modificar" method="obtenerCerveceria"/>
    	<s:submit value="Eliminar" method="eliminarCerveceria"/>
   	</s:form>
	<%}%>
</body>
</html>