package modelo.contenedora;

public class Lista<T>
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
    public void adicionarAlFinal(Nodo<T> objeto)
    {
        Nodo<T> actual;

        if(primero== null)
        {
            primero =  objeto;
        }
        else
            {
            actual = primero;
            while(actual.darSiguiente() != null){
                actual = actual.darSiguiente();
            }
            actual.cambiarSiguiente(objeto);

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
}




