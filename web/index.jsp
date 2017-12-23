<%-- 
    Document   : index
    Created on : 21/12/2017, 10:14:21 AM
    Author     : Dartz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/index_style1.css">
	<link rel="stylesheet" href="css/font.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js""></script>
	<script src='JS/scripts2.js'></script>
    </head>
    <body>
        <header>	
            <nav>
		<ul>

			<a ><li>Nosotros</li></a>
			<a href=""><li>Servicios</li></a>
		</ul>
			<img id='logo' src='Imagenes/logo2.png'>
		<ul>
                        <a href="" ><li>Admision</li></a>
			<a href="Login.jsp" ><li>Login</li></a>

		</ul>
            </nav>
	</header>
    <section id='banner'>
		
	</section>

	<section id='body'>
        <div id="header">
		<a href="Proceso1/CrearProceso.php">
		<div class="contenedor" id="uno">
			<img class="icon" src="Estilos/Imagenes/crear_proceso.png">
			<p class="texto"></p>
		</div></a>
		<a href="">
		<div class="contenedor" id="dos">
			<img class="icon" src="../Imagenes/Administrativo/ver_procesos.png">
			<p class="texto"></p>
		</div></a>
		
		<a href="">
		<div class="contenedor" id="tres">
			<img class="icon" src="../Imagenes/Administrativoproceso_actual.png">
			<p class="texto"></p>
		</div></a>
		<a href="">
		<div class="contenedor" id="cuatro">
			<img class="icon" src="../Imagenes/Administrativo/operador.png">
			<p class="texto"></p>
		</div></a>




   		</div>
		
	</section>

            
        
        
    </body>
</html>
