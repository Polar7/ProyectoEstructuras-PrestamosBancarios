package cliente.GUI;

import cliente.controlador.Controlador1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

public class AccionAgregarTipoProducto
{

    public JPanel AccionAgregarTipoProducto;
    private JTextField txtIdentificador;
    private JTextField txtNombre;
    private JButton btncancelar;
    private JButton btnagregar;

    public AccionAgregarTipoProducto(Controlador1 controlador, Socket linea)
    {

        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.enviarObjetoDTO(Integer.parseInt(txtIdentificador.getText()), txtNombre.getText(), linea);
                System.out.println(Integer.parseInt(txtIdentificador.getText())+ " " + txtNombre.getText() );
            }
        });

    }
}
