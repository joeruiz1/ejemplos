<!DOCTYPE html>
      <html>
        <head>
            <link rel="stylesheet" type="text/css" href="formato2.css">
        </head>
        <body>&lt;%@page import="java.lang.String"%&gt; &lt;%@page
          import="veo.Inventario"%&gt; &lt;%@page import="DAO.Servicios"%&gt;
          &lt; insertar nuevo libro<br>
          <form method="get" action="ControlLibro" name="forma1"> &lt;
            <table style="width: 342px; height: 265px;" border="1">
              <tbody>
                <tr>
                  <td>NOMBRE LIBRO</td>
                  <td><input name="nombreLi"></td>
                </tr>
                <tr>
                  <td>ID</td>
                  <td><input name="idLi" type="text"> </td>
                </tr>
                <tr>
                  <td>CANTIDAD</td>
                  <td><input name="cantidad" type="text"> </td>
                </tr>
                <tr>
                  <td>ESTADO</td>
                  <td><input name="estado" type="text"> </td>
                </tr>
                <tr>
                  <td>NUMERO DE EDICION</td>
                  <td><input name="numEd" type="text"> </td>
                </tr>
                <tr>
                  <td>PRECIO</td>
                  <td><input name="precioLi" type="text"> </td>
                </tr>
                <tr>
                  <td>FECHA INGRESO</td>
                  <td><input name="fechaLi" type="text"> </td>
                </tr>
                <tr>
                  <td>AUTOR</td>
                  <td><input name="autor" type="text"> </td>
                </tr>
                <tr>
                  <td>EDITORIAL</td>
                  <td><input name="editorial" type="text"> </td>
                </tr>
              </tbody>
            </table>
            <br>
            <input type="submit"><br>



        <br>
    </form>
&lt;%
          Inventario i = (Inventario)request.getAttribute("t");
           if(i != null){
        %&gt;   
          <br>
          Libro recibido:
        <table>
            <tbody><tr>
               <td>id</td>
               <td>nombre</td> 
               <td>cantidad</td>
               <td>estado</td> 
               <td>numero_ediciones</td>
               <td>precio</td> 
               <td>fecha_ingreso</td>
               <td>autor</td> 
               <td>ediorial</td>
                
            </tr>
            <tr>
               <td>&lt;%= i.getIdLibro()%&gt;</td>
               <td>&lt;%=i.getNombreLibro()%&gt;</td> 
               <td>&lt;%= i.getCantidad()%&gt;</td>
               <td>&lt;%=i.getEstado()%&gt;</td> 
               <td>&lt;%= i.getNumeroEdiciones()%&gt;</td>
               <td>&lt;%=i.getPrecio()%&gt;</td> 
               <td>&lt;%= i.getFechaIngreso()%&gt;</td>
               <td>&lt;%=i.getAutor()%&gt;</td> 
               <td>&lt;%= i.getEditorial()%&gt;</td>
               
        </tr>
        </tbody></table>
        
        &lt;%
           }
        %&gt;
</body></html>