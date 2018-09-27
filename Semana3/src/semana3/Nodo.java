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
public class Nodo {
    
    
    private Libro dato;
    private Nodo abajo;

  

    public Nodo(Libro dato) {
        this.dato = dato;
    }
    
      @Override
    public String toString() {
        return "" + dato;
    }

    public Libro getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public Nodo getAbajo() {
        return abajo;
    }

    public void setAbajo(Nodo abajo) {
        this.abajo = abajo;
    }
    
    
    
    
}
