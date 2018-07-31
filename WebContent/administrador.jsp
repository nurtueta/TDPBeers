<%@page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="Informacion.listaCervezas"%>
<%@page import="Informacion.Cerveceria"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>TDPBeers(Administrador)</title>
</head>
<body>
	<s:form action="Index" namespace="/">
		<s:submit value="Regresar"/>
	</s:form>
	<s:form action="PaginaAgregar">
		<s:submit value="Agregar"/>
	</s:form>
	<%
		listaCervezas l=new listaCervezas();
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