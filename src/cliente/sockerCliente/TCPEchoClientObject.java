package cliente.sockerCliente;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class TCPEchoClientObject {

    private InetAddress host;
    private static int PORT = 1234;

    public static void main(String[] args) {
        new TCPEchoClientObject();
    }


    public TCPEchoClientObject() {

        System.out.println("Opening host");

        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Host not found!");
            System.exit(1);
        }
        run();
    }

    private void run() {

        /*
        Socket sock = null;

        try {
            sock = new Socket(host, PORT);
            OutputStream outputStream = sock.getOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(outputStream);

            InputStream inputStream = sock.getInputStream();
            ObjectInputStream in = new ObjectInputStream(inputStream);

            List<Student> studentList =  List.of(
                new Student("Antonio","Nariño","Derecho"),
                new Student("Bill","Gates","Engineer software"),
                new Student("Diana","Trujillo","Engineer Nasa")
            );

            System.out.println("Sendind students");
            out.writeObject(studentList);
            studentList = (List<Student>) in.readObject();
            studentList.forEach(System.out::println);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                sock.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
    }
}
