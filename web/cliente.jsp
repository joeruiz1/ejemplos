<!DOCTYPE html>
      <html>
        <head>
            <link rel="stylesheet" type="text/css" href="formato2.css">
        </head>
        <body> insertar nuevo cliente<br>
          <form method="get" action="ControlClientes" name="forma1"> <br>
            <table style="width: 333px; height: 82px;" border="1">
              <tbody>
                <tr>
                  <td>NOMBRE CLIENTE</td>
                  <td><br>
                    <input name="nom"></td>
                </tr>
                <tr>
                  <td>CEDULA</td>
                  <td><input name="ced" type="text"><br>
                  </td>
                </tr>
              </tbody>
            </table>
            <input type="submit"><br>
        
        <a href="ListarCli"></a><h3>listar clientes</h3>



        
    </form>

          Cliente i = (Cliente)request.getAttribute("t");
           if(i != null){
          
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