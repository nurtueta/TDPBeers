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
	<title>Cerveceria - Inicio Sesion</title>
</head>
<body>
	<div class="bg-primary" style="display:flex;flex-direction:  column;align-items: center;height:  100vh;justify-content: center;">
		<div class="bg-light"  style="padding:  30px; border-radius: 2rem!important;">
			<div>
				<s:form action="Usuario" namespace="/">
					<s:textfield name="userlogin" label="Ingrese Usuario"/>
					<s:password name="userpwd" label="Ingrese Password"/>
					<s:submit value="Ingresar"/>
				</s:form>
			</div>
			<div style="display: flex;justify-content: flex-end;">
				<s:form action="Invitado" namespace="/">
					<s:submit value="Ingresar como invitado"/>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>