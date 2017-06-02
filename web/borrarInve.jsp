<!DOCTYPE html>
      <html>
        <head>
        </head>
        <body>&lt;%@page import="veo.Cliente"%&gt; &lt;%@page
          import="java.lang.String"%&gt; &lt;%@page import="veo.Inventario"%&gt;
          &lt;%@page import="DAO.Servicios"%&gt; &lt; insertar nuevo libro<br>
          <form method="get" action="controlBorrar" name="forma1"> <br>
            <table style="width: 333px; height: 82px;" border="1">
              <tbody>
                <tr>
                  <td>ID DEL PRODUCTO</td>
                  <td><br>
                    <input name="id"></td>
                </tr>
                
              </tbody>
            </table>
            <input type="submit"><br>
        
        <a href="http://localhost:8090//dosCorte/index.jsp"></a><h3>HOME</h3>



        
    </form>
&lt;%
          Cliente i = (Cliente)request.getAttribute("t");
           if(i != null){
        %&gt;   
          <br>
          cliente recibido:
        <table>
            <tbody><tr>
               <td>Nombre</td>
               <td>Cedula</td> 
               
                
            </tr>
            <tr>
               <td>&lt;%= i.getCedulaCliente()%&gt;</td>
               <td>&lt;%=i.getNombreCliente()%&gt;</td> 
               
               
        </tr>
        </tbody></table>
        
        &lt;%
           }
        %&gt;
</body></html>