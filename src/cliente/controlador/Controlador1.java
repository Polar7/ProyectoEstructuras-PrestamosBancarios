package cliente.controlador;

import cliente.GUI.*;
import cliente.sockerCliente.*;
import servidor.persistencia.dto.Dto;
import servidor.persistencia.dto.TipoProductoDto;;

public class Controlador1
{
    private AccionAgregarTipoProducto agregarTipoProducto;

    private Dto objetoARetornar;

    //private TCPEchoClientObject socketCliente;

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
