package servidor.socketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SingleTCPEchoServer extends Thread{

    //Socket dirigido a un hilo
    public static final int PORT = 1234;
    private Socket socket = null;
    private BufferedReader in;
    private PrintWriter out;

    public SingleTCPEchoServer(Socket sock) {

        this.socket = sock;
        try
        {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        start();
    }

    @Override
    public void run() {

        try {

        int numMsg = 0;
        String msg = null;

        do {
            msg = in.readLine();
            System.out.println("Message Received." + msg);
            out.println("Message from server ->" + msg);
            numMsg++;
        } while (!msg.equals("BYE"));

            System.out.println(numMsg +"Messages Received. Bye bye");

        } catch (IOException e)
        {
        e.printStackTrace();
        }
        finally {
                try {
                socket.close();
                }
            catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
