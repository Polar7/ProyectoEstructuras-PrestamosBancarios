package cliente.controlador;

import cliente.GUI.*;
import cliente.sockerCliente.TCPEchoClientObject;
import servidor.persistencia.dto.Dto;
import servidor.persistencia.dto.TipoProductoDto;;

public class Controlador1
{


    public static Dto objetoARetornar;

    public static final TipoProductoDto objeto  = null ;

    //private TCPEchoClientObject socketCliente;

    public void enviarObjetoDTO(int id, String nombre)
    {
        TipoProductoDto tipoProductoNuevo = new TipoProductoDto(id, nombre);

        objetoARetornar = tipoProductoNuevo;

        new TCPEchoClientObject();


    }

    public Dto getObjetoARetornar()
    {
        return objetoARetornar;
    }
}
