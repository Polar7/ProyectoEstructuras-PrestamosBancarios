package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccionAgregarUsuario {
    public JPanel MenuAgregarUsuario;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton cancelarButton;
    private JButton agregarButton;
    private JTextField textField6;
    private JTextField textField7;


    public AccionAgregarUsuario() {
        cancelarButton.addActionListener(new ActionListener() {
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
