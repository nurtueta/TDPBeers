<%@page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TDPBeers</title>
</head>
<body>
	<s:form action="Filtro" namespace="/">
		<s:textfield name="userlogin" label="Ingrese Usuario"/>
		<s:password name="userpwd" label="Ingrese Password"/>
		<s:submit label="Ingresar"/>
	</s:form>
	<br/>
	<s:form action="Filtro" namespace="/">
		<s:checkboxlist label="Clasificacion" list="#{'1':'Mayor','2':'Menor'}" name="selectClasi" 
		value="0" onselect=""></s:checkboxlist>
		<br/>
		<s:select label="Cervezas" 
		headerKey="0" headerValue="-----Select-----"
		list="#{'1':'Ipa','2':'Roja'}" 
		name="selectCerveza" />
		<br/>
		<s:submit label="Filtrar"/>
	</s:form>
	<br/>


	


</body>
</html>