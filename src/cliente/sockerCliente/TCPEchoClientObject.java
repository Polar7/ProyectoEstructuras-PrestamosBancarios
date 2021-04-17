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


    public TCPEchoClientObject() {

        System.out.println("Opening host");
        try {
            host = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("Host not found!");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Socket iniciar() throws IOException {
        Socket sock = null;
        sock = new Socket(host, PORT);
        return sock;
    }

     public void run(Dto object,Socket linea) {

        try {

            OutputStream outputStream = linea.getOutputStream();
            out = new ObjectOutputStream(outputStream);

            InputStream inputStream = linea.getInputStream();
            in = new ObjectInputStream(inputStream);

            Dto objetoDto = object;
            out.writeObject(objetoDto);

            System.out.println(object);

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
                linea.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
