/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimplementeligada;

/**
 *
 * @author ikero
 */
public class NodoP {
    
     Object valor;
    NodoP Siguiente;
    
    public NodoP(Object valor)
    {
        this.valor = valor;
        this.Siguiente = null;
    }
    
    public Object obtenervalor()
    {
        return valor;
    }
    
    public void enlazarSiguiente(NodoP n)
    {
        Siguiente=n;
    }
    
    public NodoP obtenerSiguiente(){
        return Siguiente;
    }
    
}
