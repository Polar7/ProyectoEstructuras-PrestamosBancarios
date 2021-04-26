package servidor.persistencia.reguladores;

import Almacenadora.Lista;
import servidor.persistencia.dto.*;

import java.sql.ResultSet;

public  class Controladorordenes
{
    public static Lista<? extends Dto> objMultipleResult(String sql, DataSource dataSource )
    {
        ResultSet resultSet;
        Lista<? extends Dto> obj =  new Lista<>();
        resultSet = dataSource.runQuery(sql);
        obj = resultMultipleRaw(sql, resultSet);
        return obj;
    }

    public static Dto objSimpleResult(String sql, DataSource dataSource )
    {
        ResultSet resultSet;
        resultSet = dataSource.runQuery(sql);
        Dto obj;
        obj = resultSimpleRaw(sql, resultSet);
        return obj;
    }

    private static Lista<? extends Dto> resultMultipleRaw(String sql, ResultSet resultSet)
    {
        if(sql.contains("public.bancos"))
        {
            Entity<BancosDto> entity = new Entity<BancosDto>(BancosDto.class);
            return entity.getMultipleRows(resultSet);
        }else
        if(sql.contains("public.productos"))
        {
            Entity<ProductosDto> entity = new Entity<ProductosDto>(ProductosDto.class);
            return entity.getMultipleRows(resultSet);
        }else
        if(sql.contains("public.tipos_productos"))
        {
            Entity<TipoProductoDto> entity = new Entity<TipoProductoDto>(TipoProductoDto.class);
            return entity.getMultipleRows(resultSet);
        }
        else
        {
            Entity<UsuarioDto> entity = new Entity<UsuarioDto>(UsuarioDto.class);
            return entity.getMultipleRows(resultSet);
        }


    }

    private static Dto resultSimpleRaw(String sql, ResultSet resultSet)
    {
        if(sql.contains("public.bancos"))
        {
            Entity<BancosDto> entity = new Entity<BancosDto>(BancosDto.class);
            return entity.getSingleRow(resultSet);
        }else
        if(sql.contains("public.productos"))
        {
            Entity<ProductosDto> entity = new Entity<ProductosDto>(ProductosDto.class);
            return entity.getSingleRow(resultSet);
        }else
        if(sql.contains("public.tipo_productos"))
        {
            Entity<TipoProductoDto> entity = new Entity<TipoProductoDto>(TipoProductoDto.class);
            return entity.getSingleRow(resultSet);
        }else
        {
            Entity<UsuarioDto> entity = new Entity<UsuarioDto>(UsuarioDto.class);
            return entity.getSingleRow(resultSet);
        }

    }
}
