<%@page language="java" contentType="text/html; charset=UTF-8"
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
	<title>TDPBeers</title>
</head>
<body>
	<s:form action="Usuario" namespace="/">
		<s:textfield name="userlogin" label="Ingrese Usuario"/>
		<s:password name="userpwd" label="Ingrese Password"/>
		<s:submit value="Ingresar"/>
	</s:form>
	<s:form action="Invitado" namespace="/">
		<s:submit value="Ingresar como invitado"/>
	</s:form>
</body>
</html>