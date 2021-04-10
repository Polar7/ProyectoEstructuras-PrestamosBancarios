package servidor.persistencia.dao;

import modelo.contenedora.Lista;
import servidor.persistencia.DataSource;
import servidor.persistencia.dto.Dto;
import servidor.persistencia.dto.TipoProductoDto;
import servidor.persistencia.dto.UsuarioDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoProductoDao extends Dao<TipoProductoDto>{

    public TipoProductoDao()
    {
        super(DataSource.getInstance());
    }

    @Override
    public Lista<TipoProductoDto> read()
    {
        DataSource         dataSource = DataSource.getInstance();
        TipoProductoDto data       = new TipoProductoDto();
        ResultSet resultSet  = dataSource.runQuery(data.read());
        Lista<TipoProductoDto> tipoproductoList = new Lista<>();
        try
        {
            while (resultSet.next())
            {
                tipoproductoList.adicionarAlFinal(getData(resultSet));
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
        return tipoproductoList;

    }

    @Override
    public TipoProductoDto findById(Dto data)
    {
        DataSource dataSource = DataSource.getInstance();
        ResultSet  resultSet  = dataSource.runQuery(data.findById());
        TipoProductoDto tipoproducto     = null;
        try {
            while (resultSet.next()) {
                tipoproducto = getData(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tipoproducto;
    }

    private TipoProductoDto getData(ResultSet resultSet) throws SQLException
    {
        return new TipoProductoDto(resultSet.getInt("id"),   // resultSet.getLong(1)
                resultSet.getString("nombre"));              //resultSet.getString(6)
    }
}

