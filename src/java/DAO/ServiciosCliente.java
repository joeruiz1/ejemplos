/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Controladores.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import VO.Cliente;
import java.net.URISyntaxException;

/**
 *
 * @author Juan Manuel
 */
public class ServiciosCliente {
    public String insertarCliente(Cliente t) throws URISyntaxException {

       
        Connection connection = Conexion.getConnection();
        String query = " insert into clientes (cedula_cliente, nombre_cliente)" + " values (?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getCedulaCliente());
            preparedStmt.setString(2, t.getNombreCliente());
           
            preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "la insercion se dio de manera correcta";
    }
 
    public List<Cliente> findALL() throws URISyntaxException {
        List<Cliente> clientes = null;
        String query = "SELECT * FROM clientes";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int cedu = 0;
            String nombrecli = null;
            

            while (rs.next()) {
                if (clientes == null) {
                    clientes = new ArrayList<Cliente>();
                }

                Cliente cliente = new Cliente();
                cedu = rs.getInt("cedula_cliente");
                cliente.setCedulaCliente(cedu);

                nombrecli = rs.getString("nombre_cliente");
                cliente.setNombreCliente(nombrecli);

                clientes.add(cliente);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de clientes");
            e.printStackTrace();
        }

        return clientes;
    }
    
}
