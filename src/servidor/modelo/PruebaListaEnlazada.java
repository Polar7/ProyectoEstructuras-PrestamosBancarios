package servidor.modelo;

import servidor.modelo.contenedora.Lista;
import servidor.modelo.contenedora.Nodo;

public class PruebaListaEnlazada
{

    public PruebaListaEnlazada()
    {

        Lista<Nodo> listaParaRetornar = new Lista<>();

        Nodo pruebaNodo = new Nodo("Hola");
        listaParaRetornar.adicionarAlFinal(pruebaNodo);
        listaParaRetornar.adicionarAlFinal(new Nodo(5));

        System.out.println(listaParaRetornar.darDataObjetos());

   //     listaParaRetornar.cambiarPrimero(new Nodo(5));
        System.out.println(listaParaRetornar);
      //  listaParaRetornar.adicionarAlFinal(new Nodo(5));
      //  listaParaRetornar.adicionarAlFinal(new Nodo(5));
      //  listaParaRetornar.adicionarAlFinal(new Nodo(5));
     //   listaParaRetornar.adicionarAlFinal(new Nodo(5));
        System.out.println(listaParaRetornar.contarElementos());
       // System.out.println(listaParaRetornar.darDataObjetos());

    }

   // public static void main(String[] args)
   // {
   //     new PruebaListaEnlazada();
  //  }


}
