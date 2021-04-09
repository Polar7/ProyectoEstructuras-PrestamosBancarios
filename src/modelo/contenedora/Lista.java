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

    /*
    Retorna los objetos de la lista
     */
    public Lista<T> darObjetos()
    {
        Lista<T> objetos = new Lista<>();

        Nodo<T> actual = primero;

        if(primero == null)
        {
            objetos = null;
        }
        else
            {
                 while (actual != null)
                 {
                      objetos.adicionarAlFinal(actual);
                      actual = actual.darSiguiente();
            }
        }


        return objetos;

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
        Nodo<T> actual;
        actual = primero;
        int contar = 0;

        while(actual != null)
        {
            contar++;
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
}




