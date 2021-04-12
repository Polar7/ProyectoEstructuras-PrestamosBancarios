package cliente.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionAgregarUsuario {
    public JPanel MenuAgregarUsuario;
    private JTextField txtcedula;
    private JTextField txtnombre;
    private JTextField txtapellido;
    private JTextField txttelefono;
    private JTextField txtfecha;
    private JButton btncancelar;
    private JButton btnagregar;
    private JTextField txtdireccion;
    private JTextField txtscore;


    public AccionAgregarUsuario()
    {
        btncancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openUsuario();
            }
        });
    }

    void openUsuario(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new MenuPrincipal().MenuPrincipal);
        frame.pack();
        frame.setVisible(true);
    }
}
