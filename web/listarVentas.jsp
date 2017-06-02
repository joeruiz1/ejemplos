<%-- 
    Document   : listarVentas
    Created on : 28/04/2017, 04:11:15 AM
    Author     : Juan Manuel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="VO.Ventas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>VENTAS:</h1>
        
        <%
         
               if(request.getAttribute("lista")!=null){
                  ArrayList<Ventas> lista= (ArrayList<Ventas>)request.getAttribute("lista");
                  for (Ventas elem : lista) {
                    %>
                    <table>
                        <tr>
                            <td> <h1><%=elem.getIdProducto()%></h1></td>
                            <td> <h1><%=elem.getIdVenta()%></h1></td>
                            <td> <h1><%=elem.getProductos()%></h1></td>

                        </tr>
                        
                    </table>
                    <%
                      }
                  
               }

           
        %>
        <img src="ValorLibros" /><br/>
    </body>
</html>
