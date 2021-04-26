package cliente.controlador;

import Almacenadora.Lista;

import javax.swing.*;

public class Control_PantallaComprobante
{
    private static Lista<Object> objetoRecibido;

    public static void recibirParaMostrarConfirmacion (Lista<Object> pObjetoRecibido)
    {
        objetoRecibido = pObjetoRecibido;
        mostrarVentana();
    }

    public static void mostrarVentana()
    {

        if(objetoRecibido.getTamanio() == 1)
        {/*
            if((Boolean)objetoRecibido.getValor(0) == true)
            {
                JFrame frameConfirmacion = crearVentana();
                JPanel panelNuevo = new JPanel();
                panelNuevo.add(new JLabel("SE HA EJECUTADO CORRECTAMENTE LA INSTRUCCION"));
                frameConfirmacion.setContentPane(panelNuevo);
            }
            else if((Boolean)objetoRecibido.getValor(0) == false)
            {
                JFrame frameConfirmacion = crearVentana();
                JPanel panelNuevo = new JPanel();
                panelNuevo.add(new JLabel("NO SE HA EJECUTADO CORRECTAMENTE LA INSTRUCCION"));
                frameConfirmacion.setContentPane(panelNuevo);
            }
            else*/
            //{
                JFrame frameConfirmacion = crearVentana();
                JPanel panelNuevo = new JPanel();
                panelNuevo.add(new JLabel(objetoRecibido.getValor(0).toString()));
                frameConfirmacion.setContentPane(panelNuevo);
           // }
        }
        else
        {
            JFrame frameConfirmacion = crearVentana();
            JPanel panelNuevo = new JPanel();
            String cadena = "";
            for (int i = 0; i < objetoRecibido.getTamanio(); i++ )
            {
                cadena += objetoRecibido.getValor(i).toString() + "\n" ;
            }
            panelNuevo.add(new JLabel(cadena));
            frameConfirmacion.setContentPane(panelNuevo);
        }
    }

    public static JFrame crearVentana()
    {
        JFrame frameConfirmacion = new JFrame("Confirmacion de operacion");
        frameConfirmacion.pack();
        frameConfirmacion.setResizable(true);
        frameConfirmacion.setSize(700, 500);
        frameConfirmacion.setVisible(true);

        return frameConfirmacion;
    }

}
