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
    </head>
    <body>
        <section>
            <h1 class="h1">Editar Producto</h1>
            <form method="get" action="control">
                <%
                    for (int i = 0; i < lista2.size(); i++) {
                        producto p = new producto();
                        p = (producto) lista2.get(i);
                %>
                <div class="form-group">
                    <label class="control-label">Nombre:</label><input type="text" name="nombre" class="form-control" value="<%=p.getNombproducto()%>">
                    <label class="control-label">Descripción:</label><input type="text" name="descripcion" class="form-control" vlaue="<%=p.getDescproducto()%>">
                </div>
                <div class="form-group">
                    <label class="control-label">Cantidad:</label><input type="text" name="cantidad" class="form-control" vlaue="<%=p.getCantproducto()%>">
                    <label class="control-label">Precio:</label><input type="text" name="precio" class="form-control" vlaue="<%=p.getPriceproducto()%>">
                </div>
                <div>
                    <input type="hidden" name="op" value="3">
                    <input type="hidden" name="id" id="id" value="<%=p.getIdproducto()%>">
                    <input type="submit" class="btn btn-primary" vlaue="Enviar">
                </div>

                <%}%>
            </form>
        </section>
    </body>
</html>
