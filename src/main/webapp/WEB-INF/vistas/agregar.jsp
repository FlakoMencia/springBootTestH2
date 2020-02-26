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
            <form action="/agregar"  method="POST" class="col-sm-5" >
                <div class="card"> 
                    <div class="card-head"> 
                        <h4>AGREGAR PERSONA</h4>
                    </div>
                    <div class="card-body">
<!--                    <div class="form-group">
                        <label> ID </label>
                        <input type="text" name="id" class="form-control" readonly="true">
                    </div>-->
                    <div class="form-group">
                        <label> NOMBRE </label>
                        <input type="text" name="name" class="form-control">
                    </div>
                    </div>
                    <div class="card-footer"> 
                        <input type="submit" value="Guardar" class="btn btn-info"/>
                        <a href="/listar" class="btn btn-link">Regre </a>
                    </div>
                </div>
            </form>

        </div>
    </body>
</html>