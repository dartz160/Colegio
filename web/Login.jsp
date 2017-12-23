<%-- 
    Document   : Login
    Created on : 21/12/2017, 03:43:47 PM
    Author     : Dartz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta charset="utf-8">
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/supersized.css">

    </head>
    <body>
                <div class="page-container">
            <br>
            <h1>Login</h1>
            <form action="Inicio" method="post">
                <input type="text" name="username" class="username" placeholder="Cuenta ">
                <input type="password" name="password" class="password" placeholder="Contraseña">
                <button type="submit">Ingresar</button>
            </form>
            
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized123.js"></script>
        
    </body>
</html>
