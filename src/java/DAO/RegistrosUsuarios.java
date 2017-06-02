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
import VO.Usuario;
import java.net.URISyntaxException;

/**
 *
 * @author Juan Manuel
 */
public class RegistrosUsuarios {

    public String insertarLibro(Usuario t) throws URISyntaxException {

        Connection connection = Conexion.getConnection();
        String query = " insert into Usuarios (usuario, nombre, password, correo, edad" + " values (?,?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, t.getUsuario());
            preparedStmt.setString(2, t.getNombre());
            preparedStmt.setString(3, t.getPassword());
            preparedStmt.setString(4, t.getCorreo());
            preparedStmt.setString(5, t.getEdad());
            preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "la insercion se dio de manera correcta";
    }

    public List<Usuario> findALL() throws URISyntaxException {
        List<Usuario> usuarios = null;
        String query = "SELECT * FROM Usuarios";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            String nombre = null;        
            String usuario = null;
            String pass = null;
            String edad = null;
            String correo = null;

            while (rs.next()) {
                if (usuarios == null) {
                    usuarios = new ArrayList<Usuario>();
                }

                Usuario user = new Usuario();             

                nombre = rs.getString("nombre");
                user.setNombre(nombre);

                usuario = rs.getString("usuario");
                user.setUsuario(usuario);

                pass = rs.getString("password");
                user.setPassword(pass);

                correo = rs.getString("correp");
                user. setCorreo(correo);

                edad = rs.getString("edad");
                user.setEdad(edad);

                usuarios.add(user);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de libros");
            e.printStackTrace();
        }

        return usuarios;
    }

}
