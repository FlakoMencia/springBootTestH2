<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD SPRING B H2</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-4">
            <a href="/nuevo" class="btn btn-success">ADICIONAR</a>
            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ACCION</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="persona" items="${personas}">
                        
                    <tr>
                        <td>${persona.id}</td>
                        <td>${persona.name}</td>
                        <td>
                            <a href="/editar/${persona.id}" class="btn btn-warning" >Editar</a>
                            <a href="/eliminar/${persona.id}" class="btn btn-danger" >Eliminar</a>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>



        </div>
    </body>
</html>
