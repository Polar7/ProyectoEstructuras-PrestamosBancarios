package cliente.sockerCliente;

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

        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Host not found!");
            System.exit(1);
        }
        run();
    }

    private void run() {


        Socket sock = null;

        try {
            sock = new Socket(host, PORT);

            OutputStream outputStream = sock.getOutputStream();
            out = new ObjectOutputStream(outputStream);

            InputStream inputStream = sock.getInputStream();
            in = new ObjectInputStream(inputStream);

            Dto objetoDto = controlador.getObjetoARetornar();
            out.writeObject(objetoDto);

            System.out.println(controlador.getObjetoARetornar());

           // System.out.println("Objeto enviado" + out.toString());

         //   Object objetoQueRecibeDelServer = in.readObject();

         //   System.out.println(objetoQueRecibeDelServer.toString());

          //  objetoDto = (Dto) in.readObject();


         /*   List<Student> studentList =  List.of(
                new Student("Antonio","Nariño","Derecho"),
                new Student("Bill","Gates","Engineer software"),
                new Student("Diana","Trujillo","Engineer Nasa")
            );

            System.out.println("Sendind students");
            out.writeObject(studentList);
            studentList = (List<Student>) in.readObject();
            studentList.forEach(System.out::println);*/
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
