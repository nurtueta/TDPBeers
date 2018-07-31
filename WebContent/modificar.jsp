<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="Administrador" namespace="/">
		<s:submit value="Regresar"/>
	</s:form>
	<s:form action="Modificar" namespace="/">
		<table>
			<tr><td><s:property value="cerveza.getNombre()"/></td></tr>
			<tr><td><s:property value="cerveza.getDireccion()"/></td></tr>
			<tr><td><s:property value="cerveza.getMejorVariedad()"/></td></tr>
			<tr><td><s:property value="cerveza.getDesc()"/></td></tr>
			<tr><td><s:property value="cerveza.getPuntaje()"/></td></tr>
			<tr><td><s:submit value="modificar"/></td></tr>
		</table>
	</s:form>
</body>
</html>