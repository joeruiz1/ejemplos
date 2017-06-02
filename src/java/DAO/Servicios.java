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
import VO.Factura;
import VO.Inventario;
import VO.Ventas;


/**
 *
 * @author Juan Manuel
 */
public class Servicios {

    public String insertarLibro(Inventario t)  {

        Connection connection = Conexion.getConnection();
        String query = " insert into inventario (id_libro, nombre_libro, cantidad, estado, numero_ediciones, precio, fecha_ingreso, autor, editorial )" + " values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdLibro());
            preparedStmt.setString(2, t.getNombreLibro());
            preparedStmt.setInt(3, t.getCantidad());
            preparedStmt.setString(4, t.getEstado());
            preparedStmt.setInt(5, t.getNumeroEdiciones());
            preparedStmt.setFloat(6, t.getPrecio());
            preparedStmt.setString(7, t.getFechaIngreso());
            preparedStmt.setString(8, t.getAutor());
            preparedStmt.setString(9, t.getEditorial());
            preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "la insercion se dio de manera correcta";
    }

    public String borrarLibro(int id)  {

        try {
            Connection connection = Conexion.getConnection();
            PreparedStatement preparedStmt = null;
            String query = "delete * from users where id = ?";
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, id);
            preparedStmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
            return "fallo al borrar";
        }

        return "actualizado";

    }

    public List<Inventario> findALL(){
        List<Inventario> inventarios = null;
        String query = "SELECT * FROM inventario";
        Connection connection = Conexion.getConnection();
        try {
            try (Statement st = connection.createStatement()) {
                ResultSet rs = st.executeQuery(query);
                int id = 0;
                String nombreL = null;
                int Cantidad = 0;
                String estado = null;
                int numE = 0;
                int precio = 0;
                String fechaIn = null;
                String autor = null;
                String editorial = null;
                
                while (rs.next()) {
                    if (inventarios == null) {
                        inventarios = new ArrayList<>();
                    }
                    
                    Inventario Libro = new Inventario();
                    id = rs.getInt("id_Libro");
                    Libro.setIdLibro(id);
                    
                    nombreL = rs.getString("nombre_libro");
                    Libro.setNombreLibro(nombreL);
                    
                    Cantidad = rs.getInt("cantidad");
                    Libro.setCantidad(Cantidad);
                    
                    estado = rs.getString("estado");
                    Libro.setEstado(estado);
                    
                    numE = rs.getInt("numero_ediciones");
                    Libro.setNumeroEdiciones(numE);
                    
                    precio = rs.getInt("precio");
                    Libro.setPrecio(precio);
                    
                    fechaIn = rs.getString("fecha_ingreso");
                    Libro.setFechaIngreso(fechaIn);
                    
                    autor = rs.getString("autor");
                    Libro.setAutor(autor);
                    
                    editorial = rs.getString("editorial");
                    Libro.setEditorial(editorial);
                    
                    inventarios.add(Libro);
                }
            }

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de libros");
            e.printStackTrace();
        }

        return inventarios;
    }

    public void comprarLibro(String ids,int nom,int cantidad,int valor) throws SQLException{
        Connection connection = null;
        connection = Conexion.getConnection();
        Statement st = connection.createStatement();
        PreparedStatement preparedStmt = null;
        
       
        String query = "delete * FROM inventario where id_libro = ?";

        preparedStmt = connection.prepareStatement(query);
        preparedStmt.setInt(1, nom);
        preparedStmt.execute();

        try {

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
               
            }
        } catch (SQLException e) {
            System.out.println("No se ha encontrado el libro");
            e.printStackTrace();
        }
        int nombre=nom;
        query = " insert into ventas (producto, numero_ventas, id_producto, id_venta)"
                + " values (?, ?, ?, ?)";
        try {
            preparedStmt = connection.prepareStatement(query);
           
            preparedStmt.setString(1,ids );
            preparedStmt.setInt(2, can);
            preparedStmt.setInt(3, t.getIdFactura());
            preparedStmt.setInt(4, t.getPrecio());
            

            // execute the preparedstatement
            preparedStmt.execute();

            System.out.println("You made it, the insertion is ok!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("Failed to make insertion!");
            e.printStackTrace();
        }

       
       
        st.close();

    }

    public boolean update(Inventario t)  {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "update inventario set nombre_libro = ? where id_Libro = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);

            preparedStmt.setInt(1, t.getIdLibro());
            preparedStmt.setString(2, t.getNombreLibro());

            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean delete(Inventario t) {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = "delete from inventario where id_libro = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdLibro());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    
    public List<Inventario> precios(){
        List<Inventario> inventarios = null;
        String query = "select precio, count(*) as total from inventario group by precio;";
        Connection connection = Conexion.getConnection();
        try {
            try (Statement st = connection.createStatement()) {
                ResultSet rs = st.executeQuery(query);
                int precio = 0;
                int total = 0;
               
                
                while (rs.next()) {
                    if (inventarios == null) {
                        inventarios = new ArrayList<>();
                    }
                    
                    Inventario Libro = new Inventario();
                    precio = rs.getInt("precio");
                    Libro.setIdLibro(precio);
                   
                    total = rs.getInt("total");
                    Libro.setCantidad(total);
                    
                    
                    inventarios.add(Libro);
                }
            }

        } catch (SQLException e) {
            System.out.println("Problemas ");
            e.printStackTrace();
        }

        return inventarios;
    }
    
    public List<Inventario> TotalDatos(){
        List<Inventario> inventarios = null;
        String query = "select count(*) as suma from inventario;";
        Connection connection = Conexion.getConnection();
        try {
            try (Statement st = connection.createStatement()) {
                ResultSet rs = st.executeQuery(query);

                int total = 0;
               
                
                while (rs.next()) {
                    if (inventarios == null) {
                        inventarios = new ArrayList<>();
                    }
                    
                    Inventario Libro = new Inventario();
                   
                    total = rs.getInt("total");
                    Libro.setCantidad(total);
                    
                    
                    inventarios.add(Libro);
                }
            }

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de libros");
            e.printStackTrace();
        }

        return inventarios;
    }

}
