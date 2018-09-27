/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author ulacit
 */
public class Libro {
    
    private String nombre, autor;
    private int publicacion;
    
    public Libro(String nombre, String autor, int publicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.publicacion = publicacion;
    }
        
     @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", publicacion=" + publicacion + '}' + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }
    
}
