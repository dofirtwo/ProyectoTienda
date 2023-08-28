/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotienda;

/**
 *
 * @author SENA
 */
public class Producto {
    private String Codigo;
    private String nombre;
    private String categoria;
    private double precio;

    
    public Producto() {
    }

    public Producto(String Codigo, String nombre, String categoria, double precio) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
