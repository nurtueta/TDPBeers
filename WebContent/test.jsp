<%@page import="org.apache.struts2.ServletActionContext"%>
<%@ page import="Informacion.listaCervecerias" %>
<%@ page import="Informacion.Cerveceria" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		listaCervecerias l=new listaCervecerias();
			for(Cerveceria cerveza: l.getLista())
			{
	%>
	<table id="listaDeCervezas">
		<img src="<%out.print(cerveza.getImagen());%>" width="200" height="100"/>
		<tr><td>Cerveceria: </td><td><%out.println(cerveza.getNombre()); %></td></tr>
		<tr><td>Direccion: </td><td><%out.println(cerveza.getDireccion()); %></td></tr>
	</table>
	<%}%>

</body>
</html>