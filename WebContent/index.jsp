<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ingreso</title>
</head>
<body>
	<s:form action="Validar">
		<s:textfield name="userlogin" laber="Ingrese Usuario"/>
		<s:password name="userpwd" label="Ingrese Password"/>
		<s:submit name="usernombre" label="Ingresar"/>
	</s:form>
</body>
</html>