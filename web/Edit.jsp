<%-- 
    Document   : Edit
    Created on : 22-jun-2016, 11:09:43
    Author     : FIA-LAB1D6
--%>

<%@page import="entity.producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="lista2" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.css" rel="stylesheet" type="text/css"/>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1 class="h1">Editar Producto</h1>
        <section class="container container-fluid">
            <form method="get" action="control">
                <%
                    for (int i = 0; i < lista2.size(); i++) {
                        producto p = new producto();
                        p = (producto) lista2.get(i);
                %>
                <div class="form-group">
                    <div class="input-field">
                        <input type="text" id="nombre" name="nombre" class="form-control validate" value="<%=p.getNombproducto()%>"><label class="control-label" for="nombre">Nombre:</label>
                    </div>
                    <div class="input-field">
                        <input type="text" id="descripcion" name="descripcion" class="form-control validate" value="<%=p.getDescproducto()%>"><label class="control-label" for="descripcion">Descripción:</label>
                    </div>
                    
                </div>
                <div class="form-group">
                    <input type="text" id="cantidad" name="cantidad" class="form-control validate" value="<%=p.getCantproducto()%>"><label class="control-label" for="cantidad">Cantidad:</label>
                    <input type="text" id="precio" name="precio" class="form-control validate" value="<%=p.getPriceproducto()%>"><label class="control-label" for="precio">Precio:</label>
                </div>
                <div>
                    <input type="hidden" name="op" value="3">
                    <input type="hidden" name="id" id="id" value="<%=p.getIdproducto()%>">
                    <input type="submit" class="btn btn-primary" value="Enviar">
                </div>

                <%}%>
            </form>
        </section>
    </body>
</html>
