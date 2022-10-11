/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimplementeligada;
import javax.swing.JOptionPane;

/**
 *
 * @author ikero
 */
public class ListaSimplementeLigada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaP lista = new ListaP();
        
        System.out.println("Esta vacia: "+ lista.estaVacia());
        
        lista.addPrimero("6");
        lista.addPrimero("5");
        lista.addPrimero("4");
        lista.addPrimero("3");
        lista.addPrimero("2");
        lista.addPrimero("1");
        
        
        
        System.out.println("Primer elemento: " + lista.obtener(0));
        System.out.println("Index 2: " + lista.obtener(2));
        System.out.println("Ultimo: " + lista.obtener(lista.size()-1));
        System.out.println("tamaño:" + lista.size());
        System.out.println("Esta vacia: " + lista.estaVacia());
        // TODO code application logic here
    }
    
}
