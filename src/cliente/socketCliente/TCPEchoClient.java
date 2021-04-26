package cliente.socketCliente;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import Almacenadora.Lista;

public class TCPEchoClient {

    private InetAddress host;
    private static final int PORT = 1234;
    private String inst;



    public TCPEchoClient() {

        System.out.println("Empezando El Host");
        try
        {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e)
        {
            System.out.println("Host not found!");
            System.exit(1);
        }

    }public void setInst(String inst){
        this.inst = inst;
    }

    public void enviar() {

        Socket sock = null;

        try {
            sock = new Socket(host, PORT);

            InputStream inputStream = sock.getInputStream();
            ObjectInputStream in = new ObjectInputStream(inputStream);

            PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
            out.println(inst);

            //Lista<Object> objectLista  = (Lista<Object>) in.readObject();


        }
        catch (IOException error){
            error.printStackTrace();
            System.out.println(error);
        }
        finally {
            try{
                sock.close();
            }catch (IOException error){
                error.printStackTrace();
            }
        }


    }
}
