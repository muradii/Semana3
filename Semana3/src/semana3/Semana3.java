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
public class Semana3 {
    
    public static void main(String[] args){
    
        Pila pila = new Pila ();
        
        pila.push(new Nodo(new Libro("Salem","SK", 1980)));
        pila.push(new Nodo(new Libro("Carrie","SK", 1970)));
        pila.push(new Nodo(new Libro("IT","SK", 1997)));
        pila.push(new Nodo(new Libro("Green Mile","SK", 1940)));
    
        System.out.println(pila);
        
       // System.out.println(pila);
        /*Nodo aux = pila.pop();
        while (aux!=null){
            System.out.println(aux);
            aux = pila.pop();
        }*/
        
        
    }
    
    
}
