package cliente.controlador;

import cliente.socketCliente.TCPEchoClientObject;
import servidor.persistencia.dto.Dto;
import servidor.persistencia.dto.TipoProductoDto;;

public class Controlador1 {

    public static Dto objetoARetornar;

    public static final TipoProductoDto objeto  = null ;



    public void enviarObjetoDTO(int id, String nombre)
    {
        TipoProductoDto tipoProductoNuevo = new TipoProductoDto(id, nombre);
        objetoARetornar = tipoProductoNuevo;


    }

    public Dto getObjetoARetornar()
    {
        return objetoARetornar;
    }

}
