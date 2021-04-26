package cliente.controlador;

import Almacenadora.Lista;

import javax.swing.*;

public class Control_PantallaComprobante
{
    private static Lista<Object> objetoRecibido;

    /**
     * Recibe y asigna un nuevo objeto pasado por el socket del server
     * @param pObjetoRecibido OBjeto del server
     */
    public static void recibirParaMostrarConfirmacion (Lista<Object> pObjetoRecibido)
    {
        objetoRecibido = pObjetoRecibido;
        mostrarVentana();
    }

    /**
     * Muestra una ventana de confirmacion tras realizar una operacion
     */
    public static void mostrarVentana()
    {

        if(objetoRecibido.getTamanio() == 1)
        {
            if(objetoRecibido.getValor(0) instanceof Boolean)
            {
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
            }
            else
            {
                JFrame frameConfirmacion = crearVentana();
                JPanel panelNuevo = new JPanel();
                panelNuevo.add(new JLabel(objetoRecibido.getValor(0).toString()));
                frameConfirmacion.setContentPane(panelNuevo);
            }
        }
        else
        {
            JFrame frameConfirmacion = crearVentana();
            JPanel panelNuevo = new JPanel();
            String cadena = "";
            for (int i = 0; i < objetoRecibido.getTamanio(); i++ )
            {
                cadena += objetoRecibido.getValor(i).toString();
            }
            panelNuevo.add(new JLabel(cadena));
            frameConfirmacion.setContentPane(panelNuevo);
        }
    }

    /**
     * Crea una ventana de confirmacion
     * @return Una ventana
     */
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
