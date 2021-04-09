package servidor;

import modelo.PruebaListaEnlazada;
import modelo.contenedora.Lista;
import modelo.contenedora.Nodo;
import servidor.persistencia.dto.UsuarioDto;

import java.util.Iterator;

public class Prueba
{
    public Prueba()
    {
        Lista<UsuarioDto> listaParaRetornar = new Lista<>();

        listaParaRetornar.adicionarAlFinal(new UsuarioDto(5742));

        System.out.println(listaParaRetornar.contarElementos());
        System.out.println(listaParaRetornar.darDataObjetos());


    }
    public static void main(String[] args)
    {
        new Prueba();
    }

}
