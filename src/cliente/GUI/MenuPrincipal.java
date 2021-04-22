package cliente.GUI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    public JPanel MenuPrincipal;
    private JButton btnagregarUsuario;
    private JButton btneliminarUsuario;
    private JButton btnagregarTipoDeProducto;
    private JButton btneliminarTipoDeProducto;
    private AccionAgregarTipoProducto panelTipoProducto;

    public MenuPrincipal()
    {



        btnagregarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openAgregarUsuario();
            }
        });
        btneliminarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openEliminarUsuario();
            }
        });
        btnagregarTipoDeProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openAgregarTipoProducto();
            }
        });
        btneliminarTipoDeProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openEliminarTipoProducto();
            }
        });
    }


    public void main() {
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
