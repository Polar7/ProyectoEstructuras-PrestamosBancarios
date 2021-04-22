package cliente.controlador;

import cliente.GUI.*;
import cliente.sockerCliente.TCPEchoClientObject;
import servidor.persistencia.dto.Dto;
import servidor.persistencia.dto.TipoProductoDto;

import java.net.Socket;

public class Controlador1
{

    public void enviarObjetoDTO(int id, String nombre, Socket linea)
    {
        TipoProductoDto tipoProductoNuevo = new TipoProductoDto(id, nombre);

    }


}
