<%@page language="java" contentType="text/html;charset=UTF-8"
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
    <title>Cerveceria (Administrador)</title>
  </head>
  <body>
  	<div class="fixed-top">
		<div class="row container-fluid bg-primary mb-3" style="padding-top: 10px; padding-bottom:10px;">
			<div class="col-md-2">
	  			<s:form action="Index" namespace="/">
					<s:submit value="Cerrar sesion"/>
				</s:form>
  			</div>
  			<div class="col-md-2">
	  			<s:form action="PaginaAgregar">
					<s:submit value="Agregar"/>
				</s:form>
  			</div>
		</div>
	</div>
	<div class="container-fluid bg-primary"  style="padding-top:  30px;padding-bottom: 10px;">
	<%
		listaCervecerias l=new listaCervecerias();
		for(Cerveceria cerveza: l.getLista())
		{
	%>	
	  <div class="row border border-primary p-3 mb-2 bg-light text-dark" style="margin-top:  20px;margin-bottom:  20px;margin-left:  20px;margin-right:  20px;
	  			border-radius: 2rem!important;">
	      		<div class="col-md-4">
	      			<img src="<%out.print(cerveza.getImagen());%>" class="rounded col-md-12" width="fit-content" height="fit-content">
	      			
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
                            	<td class="col-md-8"><%out.print(cerveza.getDireccion());%></td>
                        	</tr>
                        	<tr class="row">
                                <th class="col-md-4">Mejor variedad:</th>
                            	<td class="col-md-8"><%out.println(cerveza.getMejorVariedad());%></td>
                        	</tr>
                        	<tr class="row">
                                <th class="col-md-4">Puntaje:</th>
                            	<td class="col-md-8"><%out.println(cerveza.getPuntaje());%></td>
                        	</tr>
                        	<tr class="row">
                        		<td class="col-md-8"/>
	                        	<td class="col-md-2">
	                        		<s:form action="Editar" namespace="/">
										<s:set name="nombre"><%out.println(cerveza.getNombre());%></s:set> 
										<s:hidden name="nombreCerveceria" value="%{nombre}"/> 
										<s:submit value="Modificar" method="modificar"/>
		   							</s:form>
		   						</td>
		   						<td class="col-md-2">
		   							<s:form action="Eliminar" namespace="/">
										<s:set name="nombre"><%out.println(cerveza.getNombre());%></s:set> 
										<s:hidden name="nombreCerveceria" value="%{nombre}"/> 
		    							<s:submit value="Eliminar"/>
	    							</s:form>
	    						</td>
	    					</tr>  
                    	</tbody>
                    </table>
				</div>
		</div>
   	<%}%>
   	</div>
</body>
</html>