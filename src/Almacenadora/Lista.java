package Almacenadora;

import java.io.Serializable;

public class Lista<T> implements Serializable
{
    private Nodo<T> inicio;

    private int tamanio;
    /**
     * Constructor
     */
    public void Lista()
    {
        inicio = null;
        tamanio = 0;
    }
    /**
     * Consulta si la lista esta vacia.
     */
    public boolean esVacia()
    {
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     */
    public int getTamanio()
    {
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo al final de la lista.
     */
    public void agregarAlFinal(T dato)
    {
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(dato);
        if (esVacia())
        {
            inicio = nuevo;
        }
        else
        {
            // Crea ua copia de la lista.
            Nodo<T> aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null)
            {
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }
    /**
     * Agrega un nuevo nodo al inicio de la lista.
     */
    public void agregarAlInicio(T dato)
    {
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(dato);
        if (esVacia())
        {
            inicio = nuevo;
        }
        else
        {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        tamanio++;
    }

    public T getValor(int posicion)
    {
        if (posicion == 0)
        {
            return inicio.getValor();
        }
        else
        {
            Nodo<T> aux = inicio;
            for (int i = 0; i < posicion; i++)
            {
                aux = aux.getSiguiente();
            }
            return aux.getValor();
        }
    }
}




