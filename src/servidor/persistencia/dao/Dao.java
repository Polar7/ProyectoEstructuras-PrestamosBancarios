
package servidor.persistencia.dao;

import servidor.persistencia.DataSource;
import servidor.persistencia.Entity;
import servidor.persistencia.dto.Dto;
import servidor.contenedora.listaSimplementeEnlazada.Lista;

import java.sql.ResultSet;

/**
 * @author Saul Osbaldo Aponte Lopez
 */
public abstract class Dao<T extends Dto>
{

    private final DataSource dataSource;

    protected Dao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public boolean insert(Dto data)
    {
        return dataSource.runUpdateQuery(data.insert());
    }

   // public abstract Lista<T> read();
   public Lista<T> read(Dto data)
   {
       Entity<T> entity = new Entity<T>(data.getClass());
       ResultSet resultSet = dataSource.runQuery(data.read());
       return entity.getMultipleRows(resultSet);
   }

    public boolean update(Dto data)
    {
        return dataSource.runUpdateQuery(data.update());
    }

    public boolean delete(Dto data)
    {
        return dataSource.runUpdateQuery(data.delete());
    }

   // public abstract T findById(Dto data);

    public T findById(Dto data)
    {
        Entity<T> entity = new Entity<T>(data.getClass());
        ResultSet resultSet = dataSource.runQuery(data.findById());
        return entity.getSingleRow(resultSet);
    }

}
