package servidor.contenedora.listaSimplementeEnlazada;

public class Nodo<T> {

    private T data;
    private Nodo<T> siguiente;

    public Nodo(T pData)
    {
        this.data = pData;
        siguiente = null;
    }

    public T darData()
    {
        return data;
    }

    public void cambiarData(T data)
    {
        this.data = data;
    }


    public Nodo<T> darSiguiente()
    {
        return siguiente;
    }

    public void cambiarSiguiente(Nodo<T> pSiguiente)
    {
        this.siguiente = pSiguiente;
    }

    @Override
    public String toString()
    {
        return "Nodo{" + "Data=" + data + "}: ";
    }
}
