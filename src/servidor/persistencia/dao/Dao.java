
package servidor.persistencia.dao;

import servidor.persistencia.DataSource;
import servidor.persistencia.dto.Dto;
import servidor.persistencia.dto.UsuarioDto;
import modelo.contenedora.Lista;

import java.util.Collection;

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

    public abstract Lista<T> read();

    public boolean update(Dto data)
    {
        return dataSource.runUpdateQuery(data.update());
    }

    public boolean delete(Dto data)
    {
        return dataSource.runUpdateQuery(data.delete());
    }

    public abstract T findById(Dto data);

}
