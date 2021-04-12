package servidor.socketServer;

import servidor.controlador.Controlador2;
import servidor.persistencia.dto.Dto;

import java.io.*;
import java.net.Socket;

public class SingleTCPEchoServer extends Thread{

    //Socket dirigido a un hilo
    public static final int PORT = 1234;
    private Socket socket = null;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    private Controlador2 controlador2;

    public SingleTCPEchoServer(Socket sock) {

        this.socket = sock;
        try
        {
         //   in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         //   out = new PrintWriter(socket.getOutputStream(), true);
            OutputStream outputStream = sock.getOutputStream();
            out = new ObjectOutputStream(outputStream);

            InputStream inputStream = sock.getInputStream();
            in = new ObjectInputStream(inputStream);




        } catch (IOException e) {
            e.printStackTrace();
        }
        start();
      //  run();
    }

    @Override
    public void run()
    {

        try
        {
            System.out.println("Estoy recibiendo...");

            Dto objetoRecibido = (Dto) in.readObject();

            System.out.println("Objeto recibido: " + objetoRecibido);

           // controlador2.recibirObjeto(objetoRecibido);

          //  out.writeObject(controlador2.devolver());




        } catch (IOException | ClassNotFoundException e)
        {
        e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }
}
