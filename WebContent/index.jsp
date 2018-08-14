<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@page import="Informacion.listaCervecerias"%>
<%@page import="Informacion.Cerveceria"%>
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
		<s:reset value="Borrar" /> 
		<s:submit value="Ingresar"/>
	</s:form>
	<br/>
	<table class="table table-bordered">
		<tbody>
			<%
				listaCervecerias l=new listaCervecerias();
				for(Cerveceria cerveza: l.getLista())
				{
			%>
		  	<tr>
		      	<td><img src="<%out.print(cerveza.getImagen());%>" width="300" height="150"/></td>
		      	<td><table class="table table-bordered">
				<tbody>
					<tr>
						<td>Cerveceria:</td>
						<td><%out.println(cerveza.getNombre());%></td>
					</tr>
					<tr>
						<td>Direccion:</td>
						<td><%out.println(cerveza.getDireccion());%></td>
					</tr>
					<tr>
						<td>Variedad:</td>
						<td><%out.println(cerveza.getMejorVariedad());%></td>
					</tr>
					<tr>
						<td>Puntaje:</td>
						<td><%out.println(cerveza.getPuntaje());%></td>
					</tr>
				</tbody>
				</table>
				</td>
		    </tr>
	    	<%}%>
	    </tbody>
	</table>
</body>
</html>