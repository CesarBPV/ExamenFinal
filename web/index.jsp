<%-- 
    Document   : index
    Created on : 22-jun-2016, 9:53:39
    Author     : FIA-LAB1D6
--%>


<%@page import="entity.producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="lista" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <title>Control del inventario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="js/jquery-2.2.4.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/materialize.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <h1 class="h1">Control del Inventario</h1>
        </header>
        <section class="container">
            <table class="striped centered responsive-table">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Cantidad</th>
                        <th>Precio Unitario</th>
                        <th>Total</th>
                        <th colspan="2">Operaciones</th>
                    </tr>
                </thead>
                <tbody>
                <%
                    for (int i = 0; i < lista.size(); i++) {
                        producto p = new producto();
                        p = (producto) lista.get(i);
                %>
                    <tr>
                        <td><%=p.getIdproducto()%></td>
                        <td><%=p.getNombproducto()%></td>
                        <td><%=p.getDescproducto()%></td>
                        <td><%=p.getCantproducto()%></td>
                        <td><p>S/ <%=p.getPriceproducto()%></p></td>
                        <td><p>S/ <%=p.getPriceproducto() * p.getCantproducto()%></p></td>
                        <td><a href="control?op=2&id=<%=p.getIdproducto()%>"><span class="glyphicon glyphicon-edit"></span></a></td>
                        <td><a href="control?op=6&id=<%=p.getIdproducto()%>"><span class="glyphicon glyphicon-erase"></span></a></td>
                    </tr>
                <%}%>
                </tbody>
            </table>
            <a href="control?op=4" class="btn btn-primary" role="button" id="boton">Producto Nuevo</a>
        </section>
    </body>
</html>
