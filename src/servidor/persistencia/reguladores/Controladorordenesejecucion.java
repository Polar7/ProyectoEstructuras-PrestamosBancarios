package servidor.persistencia.reguladores;

import Almacenadora.Lista;



public class Controladorordenesejecucion
{
    public static Lista<Object> resultExecuteUpdate(String sql, DataSource dataSource)
    {
        Lista<Object> toListResult =new Lista<>();
        toListResult.agregarAlFinal(dataSource.runExecuteUpdate(sql));
        return toListResult;
    }
}
