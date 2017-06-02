<%-- 
    Document   : listar
    Created on : 23/04/2017, 09:37:10 PM
    Author     : Juan Manuel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="VO.Inventario"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <meta content="text/html; charset=ISO-8859-1"
              http-equiv="content-type">
        <link rel="stylesheet" type="text/css" href="formato2.css">
        <title></title>
    </head>
    <body>
        <h1>Inventario:</h1> 


        <%
         
           
               if(request.getAttribute("lista")!=null){
                  ArrayList<Inventario> lista= (ArrayList<Inventario>)request.getAttribute("lista");
                  for (Inventario elem : lista) {
                    %>
                    <table>
                        <tr>
                            <td> <h1><%=elem.getIdLibro()%></h1></td
                            <td> <h1><%=elem.getNombreLibro()%></h1></td>

                        </tr>
                        
                    </table>
                    <%
                      }
                  
               }

           
        %>
    </body>
</html>