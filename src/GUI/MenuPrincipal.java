package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    public JPanel MenuPrincipal;
    private JButton agregarUsuarioButton;
    private JButton eliminarUsuarioButton;
    private JButton agregarTipoDeProductoButton;
    private JButton eliminarTipoDeProductoButton;

    public MenuPrincipal() {
        agregarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openAgregarUsuario();
            }
        });
        eliminarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openEliminarUsuario();
            }
        });
        agregarTipoDeProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openAgregarTipoProducto();
            }
        });
        eliminarTipoDeProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openEliminarTipoProducto();
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuPrincipal");
        frame.setContentPane(new MenuPrincipal().MenuPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    void openAgregarUsuario(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionAgregarUsuario().MenuAgregarUsuario);
        frame.pack();
        frame.setVisible(true);
    }
    void openEliminarUsuario(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionElimarUsuario().AccionEliminarUsuario);
        frame.pack();
        frame.setVisible(true);
    }
    void openAgregarTipoProducto(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionAgregarTipoProducto().AccionAgregarTipoProducto);
        frame.pack();
        frame.setVisible(true);
    }
    void openEliminarTipoProducto(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionEliminarTipoProducto().AccionEliminarTipoProducto);
        frame.pack();
        frame.setVisible(true);
    }

}
