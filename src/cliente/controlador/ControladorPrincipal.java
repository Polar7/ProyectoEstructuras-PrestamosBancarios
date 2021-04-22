package cliente.controlador;

import cliente.GUI.MenuPrincipal;
import cliente.socketCliente.*;

public class ControladorPrincipal
{
    private MenuPrincipal menuGUI;
    private TCPEchoClientObject socketCliente;


    public ControladorPrincipal()
    {
        menuGUI = new MenuPrincipal();
        menuGUI.main();

        socketCliente = new TCPEchoClientObject();
    }


    public static void main(String[] args)
    {
        new ControladorPrincipal();
    }
}
