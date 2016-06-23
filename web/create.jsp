<%-- 
    Document   : create
    Created on : 22/06/2016, 09:05:03 PM
    Author     : CESAR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-2.2.4.min.js" type="text/javascript"></script>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
        <script src="js/materialize.min.js" type="text/javascript"></script>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <title>Create Product</title>
    </head>
    <body>
        <h1 class="h1">Crear Producto</h1>
        <section class="container">
            <form method="get" action="control" class="col s12">
                <div class="input-group row">
                    <div class="input-field col s12 m6">
                        <input id="nombre" type="text" class="validate" name="nombre" required="required">
                        <label for="nombre">Nombre</label>
                    </div>
                    <div class="input-field col s12 m6">
                        <input type="text" id="descripcion" name="descripcion" class="validate" required="required">
                        <label for="descripcion">Descripción</label>
                    </div>
                </div>
                <div class="input-group row">
                    <div class="input-field col s12 m6">
                        <input type="text" id="cantidad" name="cantidad" class="validate" required="required">
                        <label for="cantidad">Cantidad</label>
                    </div>
                    <div class="input-field col s12 m6">
                        <input type="text" id="price" name="precio" class="validate" required="required">
                        <label for="price">Precio</label>
                    </div>
                </div>
                <div class="input-group">
                    <input type="hidden" name="op" value="5">
                    <button class="btn waves-effect waves-light" type="submit" name="action">Enviar
                        <i class="material-icons right">send</i>
                    </button>
                </div>
            </form>
        </section>
    </body>
</html>
