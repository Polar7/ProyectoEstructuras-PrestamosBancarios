package cliente.GUI;

import cliente.controlador.Controlador1;
import cliente.sockerCliente.TCPEchoClientObject;
import servidor.controlador.Controlador2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

public class MenuPrincipal {
    public static Controlador1 controladorinicial;
    public JPanel MenuPrincipal;
    private JButton btnagregarUsuario;
    private JButton btneliminarUsuario;
    private JButton btnagregarTipoDeProducto;
    private JButton btneliminarTipoDeProducto;

    private Controlador2 controladorsecundario;

    private Socket tcpSocket;

    public MenuPrincipal() throws IOException {

        tcpSocket = new TCPEchoClientObject().iniciar();
        controladorinicial =  new Controlador1();

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

                try {
                    openAgregarTipoProducto();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        btneliminarTipoDeProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                openEliminarTipoProducto();
            }
        });
    }




    public static void run() throws IOException {
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
    void openAgregarTipoProducto() throws IOException {
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionAgregarTipoProducto(controladorinicial, tcpSocket).AccionAgregarTipoProducto);
        frame.pack();
        frame.setVisible(true);
    }
    void openEliminarTipoProducto(){
        JFrame frame = new JFrame("Agregar Usuario");
        frame.setContentPane(new AccionEliminarTipoProducto().AccionEliminarTipoProducto);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {

        run();
    }


}
