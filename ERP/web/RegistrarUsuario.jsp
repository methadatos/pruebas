<%-- 
    Document   : RegistrarUsuario
    Created on : 01-oct-2016, 22:46:34
    Author     : NicolasValenciaY
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creación usuario</title>
    </head>
    <body>
        <jsp:include page="./cargaPerfil" flush="true"/>
        <jsp:useBean id="perfil" class="duoc.cl.dej4501.erp.entidades.Perfil" scope="session"/>
        
        <fieldset><legend>Ingreso de usuario</legend>
            <form name="ingresoUsuario" method="post" action="./">
                <table>
                    <tr>
                        <td>Ingreso Username</td>
                        <td><input type="text" name="txtUsername" required=""/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="txtPassword" required=""/></td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input type="text" name="txtNombre" required=""/></td>
                    </tr>
                    <tr>
                        <td>Apellido</td>
                        <td><input type="text" name="txtApellido" required=""/></td>
                    </tr>
                    <tr>
                        <td>Correo</td>
                        <td><input type="text" name="txtCorreo" required=""/></td>
                    </tr>
                    <tr>
                        <td>Edad</td>
                        <td><input type="text" name="txtEdad" required=""/></td>
                    </tr>
                    <tr>
                        <td>Perfil</td>
                        <td>
                            <select name="txtCodPerfil">
                                <c:forEach items="${listadoPerfiles}" var="perfil">
                                    <option value="<c:out value="${perfil.codigoPerfil}"/>"><c:out value="${perfil.descripcion}"/></option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Fecha nacimiento</td>
                        <td><input type="date" name="txtFechaNacimiento"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnGuardar" value="Guardar"></td>
                        <td><input type="reset" name="btnCancelar" value="Cancelar" onclick="window.location.href='Home.jsp'"></td>
                    </tr>
                </table>
            </form>
        </fieldset>
    </body>
</html>
