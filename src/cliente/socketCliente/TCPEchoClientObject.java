package cliente.socketCliente;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import cliente.controlador.*;
import servidor.persistencia.dto.Dto;

public class TCPEchoClientObject {

    private InetAddress host;
    private static int PORT = 1234;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private Controlador1 controlador;

    public static void main(String[] args) {
        new TCPEchoClientObject();
    }


    public TCPEchoClientObject() {

        controlador = new Controlador1();
        System.out.println("Opening host");

        try
        {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e)
        {
            System.out.println("Host not found!");
            System.exit(1);
        }
        run();
    }

    private void run() {


        Socket sock = null;

        try
        {
            sock = new Socket(host, PORT);

            in = new ObjectInputStream(sock.getInputStream());

            out = new ObjectOutputStream(sock.getOutputStream());


            do
            {

            }
            while (out.toString().equals("Salir"));

            // OutputStream outputStream = sock.getOutputStream();
            // out = new ObjectOutputStream(outputStream);

            //InputStream inputStream = sock.getInputStream();
            // in = new ObjectInputStream(inputStream);

            Dto objetoDto = controlador.getObjetoARetornar();
            out.writeObject(objetoDto);

            System.out.println("Objeto enviado" + controlador.getObjetoARetornar());

            // Object objetoQueRecibeDelServer = in.readObject();

            //   System.out.println(objetoQueRecibeDelServer.toString());

            //  objetoDto = (Dto) in.readObject();

        }
        catch (IOException  e) {
            e.printStackTrace();
        }
        finally {
            try {
                sock.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
