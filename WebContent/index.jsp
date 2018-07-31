<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="Informacion.listaCervecerias"%>
<%@page import="Informacion.Cerveceria"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TDPBeers</title>
</head>
<body>
	<s:form action="Usuario" namespace="/">
		<s:textfield name="userlogin" label="Ingrese Usuario"/>
		<s:password name="userpwd" label="Ingrese Password"/>
		<s:reset value="Borrar" /> 
		<s:submit value="Ingresar"/>
	</s:form>
	<br/>
	<%
		listaCervecerias l=new listaCervecerias();
			for(Cerveceria cerveza: l.getLista())
			{
	%>
	<table id="listaDeCervezas">
		<img src="<%out.print(cerveza.getImagen());%>" width="200" height="100"/>
		<tr><td>Cerveceria: </td><td><%out.println(cerveza.getNombre());%></td></tr>
		<tr><td>Direccion: </td><td><%out.println(cerveza.getDireccion());%></td></tr>
		<tr><td>Variedad: </td><td><%out.println(cerveza.getMejorVariedad());%></td></tr>
		<tr><td>Puntaje: </td><td><%out.println(cerveza.getPuntaje());%></td></tr>
		<tr><td>Descripcion: </td><td><%out.println(cerveza.getDesc());%></td></tr>
	</table>
	<%}%>
</body>
</html>