package cliente.controlador;

import cliente.socketCliente.TCPEchoClient;

public class Control_conexion {

    private static TCPEchoClient conexion;
    private static Control_conexion paso = null;

    private Control_conexion (String inst){
        conexion = new TCPEchoClient();
        conexion.setInst(inst);
    }
    public static Control_conexion manejarConexion(String inst){
        if (paso != null){
            conexion.setInst(inst);
            return paso;
        }
        else{
            return  new Control_conexion(inst);
        }
    }
    public static  void iniciarconexion(){
        conexion.enviar();
    }
}
