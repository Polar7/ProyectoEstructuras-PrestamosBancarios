package cliente.GUI;

import cliente.controlador.Control_paso;
import cliente.socketCliente.TCPEchoClient;

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



    public AccionAgregarTipoProducto()
    {


        btnagregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Control_paso.conversioninsertar(Integer.parseInt(txtIdentificador.getText()),txtNombre.getText());
                txtNombre.setText("");
                txtIdentificador.setText("");
            }
        });
    }
}
