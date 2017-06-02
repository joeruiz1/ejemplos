<%-- 
    Document   : mostrarCli
    Created on : 28/04/2017, 09:50:38 AM
    Author     : Juan Manuel
--%>

<%@page import="VO.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>listar_clientes</title>
    </head>
    <body>
        <h1>CLIENTES:</h1> 


        <%
         
               if(request.getAttribute("lista")!=null){
                  ArrayList<Cliente> lista= (ArrayList<Cliente>)request.getAttribute("lista");
                  for (Cliente elem : lista) {
                    %>
                    <table>
                        <tr>
                            <td> <h3><%=elem.getCedulaCliente()%></h3></td
                            <td> <h3><%=elem.getNombreCliente()%></h3></td>

                        </tr>
                        
                    </table>
                    <%
                      }
                  
               }

           
        %>
    </body>
</html>
