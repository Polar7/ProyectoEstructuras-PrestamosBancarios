package servidor.controlador;

import servidor.persistencia.dao.Dao;
import servidor.persistencia.dto.Dto;

public class Controlador2
{
    private Dto objetoRecibido;

    private Dao dao;

    public void recibirObjeto(Dto objeto)
    {
        objetoRecibido = objeto;
    }

    public Object devolver()
    {
        return dao.insert(objetoRecibido);
    }


}
