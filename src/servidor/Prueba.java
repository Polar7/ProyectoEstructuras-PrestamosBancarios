package servidor;


import servidor.contenedora.listaSimplementeEnlazada.Lista;
import servidor.persistencia.dto.UsuarioDto;

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
