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

            //System.out.println("estoy leyendo");

           // InputStream inputStream = socket.getInputStream();
            in = new ObjectInputStream(socket.getInputStream());


            //OutputStream outputStream = socket.getOutputStream();
            out = new ObjectOutputStream(socket.getOutputStream());



        } catch (IOException e) {
            e.printStackTrace();
        }
        start();

    }

    @Override
    public void run()
    {

        try
        {
            Dto objetoRecibido = null;
            do
            {
                System.out.println("Estoy recibiendo...");
                objetoRecibido = (Dto) in.readObject();

                // Verificacion del objeto que está recibiendo
                System.out.println("In recibido: " + in);
                System.out.println("DTO recibido: " + objetoRecibido);

                controlador2.recibirObjeto(objetoRecibido);

                out.writeObject(controlador2.devolver());
            }
            while(in.readObject().toString().equals("Salir"));

            System.out.println("¡EL CLIENTE SE HA DESCONECTADO!");









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
                in.close();
                out.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }
}
