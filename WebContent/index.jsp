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
	<title>Cerveceria</title>
</head>
<body>
	<div class="fixed-top">
		<div class="container-fluid bg-primary mb-3" style="padding-top: 10px; padding-bottom:10px;">
			<s:form action="Inicio" namespace="/">
				<s:submit value="Iniciar Sesion"/>
			</s:form>
		</div>
	</div>
	
	<div class="container-fluid bg-primary"  style="padding-top:  30px;padding-bottom: 10px;">
	<%
		listaCervecerias l=new listaCervecerias();
		for(Cerveceria cerveza: l.getLista())
		{
	%>	
	  <div class="row rounded border border-primary p-3 mb-2 bg-light text-dark" style="margin-bottom:  20px;margin-left:  20px;margin-right:  20px;margin-top:	20px;
	  			border-radius: 2rem!important;">
	      		<div class="col-md-4">
	      			<img src="<%out.print(cerveza.getImagen());%>" class="col-md-12" width="fit-content" height="fit-content">
	      		</div>
		      	<div class="col-md-8">
		      		<table class="table table-striped">
                        <tbody>
                            <tr class="row">
                                <th class="col-md-4">Cerveceria:</th>
                            	<td class="col-md-8"><%out.println(cerveza.getNombre());%></td>
                        	</tr>
                        	<tr class="row">
                                <th class="col-md-4">Direccion:</th>
                            	<td class="col-md-8"><%out.println(cerveza.getDireccion());%></td>
                        	</tr>
                        	<tr class="row">
                                <th class="col-md-4">Mejor variedad:</th>
                            	<td class="col-md-8"><%out.println(cerveza.getMejorVariedad());%></td>
                        	</tr>
                        	<tr class="row">
                                <th class="col-md-4">Puntaje:</th>
                            	<td class="col-md-8"><%out.println(cerveza.getPuntaje());%></td>
                        	</tr>
                    	</tbody>
                    </table>
				</div>
		</div>
   	<%}%>
   	</div>
</body>
</html>