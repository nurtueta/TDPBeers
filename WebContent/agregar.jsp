<%@page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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