<%-- 
    Document   : crear usuario
    Created on : 27/04/2017, 09:34:01 PM
    Author     : fernando stiven
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta content="text/html; charset=ISO-8859-1"
              http-equiv="content-type">
        <title></title>
    </head>
    <body>
        <div style="text-align: center;">
            <form method="post" action="CrearUsuario" name="nuevou">crear
                usuario <br>
                <div style="text-align: justify;">ingrese su nombre
                    completo<input name="nombre"><br>
                    ingrese su &nbsp;usuario <input name="usuario">&nbsp;
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<br>
                    ingrese su edad <input name="edad"><br>
                    ingrese su correo electronico<input name="correo"><br>
                    ingrese su contraseña <input name="contra1"><br>
                    repita su contraseña <input name="contra2"><br>
                    <br>
                    <input name="envia" value="enviar" type="submit"></div>
                <br>
                <br>
                <br>
                <br>
                <br>
            </form>
        </div>
    </body>
</html>
