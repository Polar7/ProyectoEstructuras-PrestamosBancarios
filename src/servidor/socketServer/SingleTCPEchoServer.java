package servidor.socketServer;

import servidor.persistencia.reguladores.Controladorordenesejecucion;
import servidor.persistencia.reguladores.Controladorordenes;
import servidor.persistencia.reguladores.DataSource;

import java.io.*;
import java.net.Socket;

public class SingleTCPEchoServer extends Thread {

    //Socket dirigido a un hilo
    public static final int PORT = 1234;
    private Socket socket = null;
    private DataSource dataSource = null;
    private BufferedReader in;
    private ObjectOutputStream out;


    public SingleTCPEchoServer(Socket sock, DataSource datasource) {

        this.socket = sock;
        this.dataSource = datasource;
        try {
            // InputStream inputStream = socket.getInputStream();
            this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            //OutputStream outputStream = socket.getOutputStream();
            OutputStream outputStream = sock.getOutputStream();
            out = new ObjectOutputStream(outputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        this.start();

    }

    @Override
    public void run() {
        String inst = null;
        try {
            inst = this.in.readLine();

            if (!inst.equals("EXIT")) {
                //SELECT * FROM marcas
                //runQuery - Muliple - Busqueme todo lo de la tabla
                if (inst.contains("SELECT") && inst.indexOf("SELECT") == 0 &&
                        inst.contains("*") && inst.indexOf("*") <= 7) {
                    out.writeObject(Controladorordenes.objMultipleResult(inst, dataSource));
                } else //runQuery - Simple
                    if (inst.contains("SELECT") && inst.indexOf("SELECT") == 0) {
                       out.writeObject(Controladorordenes.objSimpleResult(inst, dataSource));
                    } else    //executeUpdate
                    {
                        out.writeObject(Controladorordenesejecucion.resultExecuteUpdate(inst, dataSource));
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                this.socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


