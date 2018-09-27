/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;
 import java.util.Scanner;
/**
 *
 * @author ulacit
 */
public class Pila {
    
    private Nodo top; // dato que este mas arriba 
    
    
    public boolean nombre (String nombre){
        Scanner input = new Scanner(System.in);
        System.out.print("Libro: ");
        nombre = input.nextLine();
        Nodo aux = top;
        while (aux != null){
          
            if (aux.getDato().getNombre().equals(nombre)){
                System.out.print(nombre);
            }
             aux = aux.getAbajo(); 
            
        }
        return false;
    }
    
    public String toString(){
        String msj = "";
        Nodo aux = top;
        while (aux != null){
            msj += (aux);
            aux = aux.getAbajo();
        }
        return msj;
        
    }    
          
    public void push(Nodo n){
        if (top == null){
            top = n;
        }else {
            n.setAbajo(top); //creacmos la union entre el primer dato y el nuevo que ahora esta hasta arriba. 
            top = n;
        }
        
    }
    
    public Nodo pop(){
    
        Nodo aux = top; // nodo auxiliar para que nos ayude a cambiar las cosas. Le damos el valor de lo que queremos quitar 
        if (aux != null){
            top=top.getAbajo();
            aux.setAbajo(null);
        }
        
        return aux;
    }
    
    
    
    
}
