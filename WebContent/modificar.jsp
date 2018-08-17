<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Cerveceria - modificar</title>
</head>
<body>
	<div class="bg-primary" style="display:flex;flex-direction:  column;align-items: center;height:  100vh;justify-content: center;">
		<div class="bg-light"  style="padding:  30px; border-radius: 2rem!important;">
			<div>
				<s:form action="Editar" namespace="/">
					<table>
						<s:textfield name="cerveceria.nombre" label="Nombre: " readonly="true"/>
						<s:textfield name="cerveceria.direccion" label="Direccion: "/>
						<s:textfield name="cerveceria.mejorVariedad" label="Mejor variedad: "/>
						<s:textfield name="cerveceria.puntaje" label="Puntaje: "/>
						<tr><td><s:submit value="Modificar" method="modificarCerveceria"/></td></tr>
					</table>
				</s:form>
			</div>
			<div style="display: flex;justify-content: flex-end;">
				<s:form action="Administrador" namespace="/">
					<s:submit value="Cancelar"/>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>