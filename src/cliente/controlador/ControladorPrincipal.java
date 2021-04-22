package cliente.controlador;

import cliente.GUI.AccionAgregarTipoProducto;
import cliente.GUI.MenuPrincipal;
import cliente.socketCliente.*;

import java.io.IOException;

public class ControladorPrincipal
{
    private MenuPrincipal menuGUI;
    private TCPEchoClientObject socketCliente;
    private AccionAgregarTipoProducto agregarTipoProducto;


    public ControladorPrincipal(MenuPrincipal pMenu,TCPEchoClientObject pCliente )
    {
       menuGUI = pMenu;
       menuGUI.main();

       socketCliente = pCliente;
    }

    //sockeCLiente.cambiarIn(accinoAgregarTIpoPorducto.getTextNOmbre);

    public static void main(String[] args)
    {
      //  new ControladorPrincipal();

        agregarTipoProducto.getTex


    }
}
