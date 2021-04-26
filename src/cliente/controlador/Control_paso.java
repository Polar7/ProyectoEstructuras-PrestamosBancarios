package cliente.controlador;

import servidor.persistencia.dao.BancosDao;
import servidor.persistencia.dao.TipoProductoDao;
import servidor.persistencia.dao.UsuarioDao;
import servidor.persistencia.dto.BancosDto;
import servidor.persistencia.dto.TipoProductoDto;
import servidor.persistencia.dto.UsuarioDto;

import java.util.Date;


public class Control_paso {

     private static TipoProductoDto tipoProductoDto;
     private static TipoProductoDao tipoProductoDao;

    private static UsuarioDto usuarioDto;
    private static UsuarioDao usuarioDao;

    private static BancosDto bancosDto;
    private static BancosDao bancosDao;


    //Controladores de conexion tipo producto
    public static void conversioninsertar(int id, String nombre){

        tipoProductoDto = new TipoProductoDto(id, nombre);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.insert(tipoProductoDto);
        iniciarenvio(inst);
    }
    public static void conversioneliminar(int id){
        tipoProductoDto = new TipoProductoDto(id);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.delete(tipoProductoDto);
        iniciarenvio(inst);
    }
    public static void conversionModificar(int id, String nombre){

        tipoProductoDto = new TipoProductoDto(id, nombre);
        tipoProductoDao = new TipoProductoDao();

        String inst = tipoProductoDao.update(tipoProductoDto);
        iniciarenvio(inst);
    }

    //controladores de conexion de Usuario
    public static void conversionAgregarUsuario(int cedula, String nombre,String apellido,int telefono, Date fecha, String  direccion,int score){
        usuarioDto = new UsuarioDto(cedula,nombre,apellido,telefono,fecha,direccion,score);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.insert(usuarioDto);
        iniciarenvio(inst);
    }
    public static void conversioneliminarUsuario(int cedula){

        usuarioDto = new UsuarioDto(cedula);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.delete(usuarioDto);
        iniciarenvio(inst);
    }
    public static void conversionModificarUsuario(int cedula, String nombre,String apellido,int telefono, Date fecha, String  direccion,int score){
        usuarioDto = new UsuarioDto(cedula,nombre,apellido,telefono,fecha,direccion,score);
        usuarioDao = new UsuarioDao();

        String inst = usuarioDao.update(usuarioDto);
        iniciarenvio(inst);
    }
    //Controles de conexion  para bancos
    public static void conversionAgregarBancos(String nombre,int nit,String  direccion,int cantidadclientes){
        bancosDto = new BancosDto(nombre,nit,direccion,cantidadclientes);
        bancosDao = new BancosDao();

        String inst = bancosDao.insert(bancosDto);
        iniciarenvio(inst);
    }
    public static void conversioneliminarBancos(String nombre){

        bancosDto = new BancosDto(nombre);
        bancosDao = new BancosDao();

        String inst = bancosDao.delete(bancosDto);
        iniciarenvio(inst);
    }
    public static void conversionModificarBancos(String nombre,int nit,String  direccion,int cantidadclientes){
        bancosDto = new BancosDto(nombre,nit,direccion,cantidadclientes);
        bancosDao = new BancosDao();

        String inst = bancosDao.update(bancosDto);
        iniciarenvio(inst);
    }

    static void iniciarenvio(String inst){
        Control_conexion.manejarConexion(inst);
        Control_conexion.iniciarconexion();
    }

}


