<%-- 
    Document   : Login
    Created on : 01-oct-2016, 21:52:53
    Author     : NicolasValenciaY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <fieldset><legend>Login</legend>
            <form name="formularioIngresoUsuario" method="post" action="">
                <table>
                    <tr>
                        <td></td>
                        <td><input type="text" name="txtUsername" placeholder="Username" required=""/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="password" name="txtPass" placeholder="Password" required=""/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnLogin" value="Ingresar"/></td>
                        <td><input type="reset" name="btnCancelar" value="Cancelar"/></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
