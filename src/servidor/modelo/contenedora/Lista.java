package servidor.modelo.contenedora;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public class Lista<T> implements Iterable<T>
{

    private Nodo<T> primero;

    public Lista()
    {
        primero = null;
    }

    public Nodo<T> darPrimero()
    {
        return primero;
    }

    public void cambiarPrimero(Nodo<T> primero)
    {
        this.primero = primero;
    }


    public String darDataObjetos()
    {
        String cadena = "";

        Nodo<T> actual = primero;

        if (primero == null)
        {
            cadena = "No hay elementos en la lista.";
        }
        else
        {
            while (actual != null)
            {
                cadena += actual.toString();
                actual = actual.darSiguiente();

            }
        }

        return cadena;

    }

    /*
    Adiciona un objeto al final de la lista
     */
    public void adicionarAlFinal(T objeto)
    {
        Nodo<T> actual;

        Nodo<T> nodoIngresar = new Nodo<>(objeto);

        if(primero== null)
        {
            primero =  nodoIngresar;
        }
        else
            {
            actual = primero;
            while(actual.darSiguiente() != null){
                actual = actual.darSiguiente();
            }
            actual.cambiarSiguiente(nodoIngresar);

        }
    }

    /*
    Cuenta todos los elementos de la lista
     */
    public int contarElementos()
    {
        Nodo actual;
        actual = primero;
        int contar = 0;

        while(actual != null)
        {
            contar++;
            actual = actual.darSiguiente();
        }
        return contar;
    }

    /*
    Elimina todos los elementos de la lista
     */
    public void eliminarTodo()
    {
        primero = null;
    }

    /*
    Retorna true si la lista esta vacia, false de lo contrario
     */
    public boolean estaVacio()
    {
        boolean comprobar = false;

        if ( primero == null)
        {
            comprobar = true;
        }

        return comprobar;
    }


    @Override
    public Iterator<T> iterator()
    {
        return null;
    }

    /*
    public Iterator<Integer> iterator() {

        int size= this.size;

        Iterator<Integer> i= new Iterator<Integer>() {

            @Override
            public boolean hasNext() {

                if (posicion<size) {

                    return true;
                }else {
                    return false;
                }

            }

            @Override
            public Integer next() {


                return numero*posicion++;
            }



        };
        return i;
    }


     */
    @Override
    public void forEach(Consumer<? super T> action)
    {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

    @Override
    public Spliterator<T> spliterator()
    {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }


}




