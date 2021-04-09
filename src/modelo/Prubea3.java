package modelo;

import modelo.contenedora.Lista;
import modelo.contenedora.Nodo;

class Prueba3
{

    public Prueba3() {

        Lista<Nodo> listaParaRetornar = new Lista<>();

        Nodo pruebaNodo = new Nodo("Hola");
        listaParaRetornar.adicionarAlFinal(pruebaNodo);

     //   contacts.adicionarAlFinal(new Nodo(5));
        System.out.println(listaParaRetornar.contarElementos());
        System.out.println(listaParaRetornar.darObjetos());

    }

    public static void main(String[] args)
    {
        new Prueba3();
    }


}
