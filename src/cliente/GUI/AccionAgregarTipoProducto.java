package cliente.GUI;

import cliente.controlador.Controlador1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionAgregarTipoProducto
{
    private Controlador1 controlador;
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

                controlador = new Controlador1();
                controlador.enviarObjetoDTO(Integer.parseInt(txtIdentificador.getText()), txtNombre.getText());
                System.out.println(Integer.parseInt(txtIdentificador.getText())+ " " + txtNombre.getText() );
                System.out.println(controlador.getObjetoARetornar());
            }
        });
    }
}
