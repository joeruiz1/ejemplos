/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Juan Manuel
 */
public class Inventario {

    private int idLibro;
    private int TotalDatos;
    private String nombreLibro;
    private int cantidad;
    private String estado;
    private int numeroEdiciones;
    private int precio;
    private String fechaIngreso;
    private String autor;
    private String editorial;

    public Inventario(){
    }
    public Inventario(int idLibro, String nombreLibro, int cantidad, String estado, int numeroEdiciones, int precio, String fechaIngreso, String autor, String editorial) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.cantidad = cantidad;
        this.estado = estado;
        this.numeroEdiciones = numeroEdiciones;
        this.precio = precio;
        this.fechaIngreso = fechaIngreso;
        this.autor = autor;
        this.editorial = editorial;
    }

   

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroEdiciones() {
        return numeroEdiciones;
    }

    public void setNumeroEdiciones(int numeroEdiciones) {
        this.numeroEdiciones = numeroEdiciones;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getTotalDatos() {
        return TotalDatos;
    }

    public void setTotalDatos(int TotalDatos) {
        this.TotalDatos = TotalDatos;
    }
    
    

}
