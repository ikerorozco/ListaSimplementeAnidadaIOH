package listasimplementeligada;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikero
 */
public class ListaP {
    
    NodoP head;
    int size;
    
    public ListaP()
    {
        head = null;
        size = 0;
    }
             
    public Object obtener(int index)
      {
         int contador = 0;
        NodoP temporal = head;
        while (contador<index) {
                temporal = temporal.obtenerSiguiente();
                contador++;
        }
        return temporal.obtenervalor();
      }
public void addPrimero(Object obj)
    {
        if (head == null)
        {
            head = new NodoP(obj);
        }
        else
        {
            NodoP temp = head;
            NodoP nuevo = new NodoP(obj);
            nuevo.enlazarSiguiente(temp);
            head = nuevo;
        }
        
        size++;
    }
    
    public void eliminar (int index)
    {
        if(index == 0)
        {
            head = head.obtenerSiguiente();
        }
        else
        {
            int contador = 0;
        NodoP temporal = head;
        while (contador < index -1)
        {
            temporal = temporal.obtenerSiguiente();
        }
        temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }


    public void eliminarPrimero()
    {
        head = head.obtenerSiguiente();
        size--;
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean estaVacia()
    {
        return (head == null)?true:false;
    }
    
}
