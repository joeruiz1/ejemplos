/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;



import Controladores.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import VO.Inventario;
import VO.Ventas;
import java.net.URISyntaxException;

/**
 *
 * @author Juan Manuel
 */
public class ServiciosVentas {
    
    
    public List<Ventas> findALL() throws URISyntaxException {
        List<Ventas> ven = null;
        String query = "SELECT * FROM ventas";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idVentas = 0;
            String product = null;
            int idPro=0;
              
            while (rs.next()) {
                if (ven == null) {
                    ven = new ArrayList<Ventas>();
                }

                Ventas ventas=new Ventas();
                idVentas = rs.getInt("id_venta");
                ventas.setIdProducto(idVentas);

                product = rs.getString("producto");
                ventas.setProductos(product);
                
                idPro=rs.getInt("is_producto");
                ventas.setIdProducto(idPro);
                
                

                ven.add(ventas);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de libros");
            e.printStackTrace();
        }

        return ven;
    }
}
