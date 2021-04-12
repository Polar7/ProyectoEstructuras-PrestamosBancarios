package servidor;


import servidor.persistencia.dao.TipoProductoDao;
import servidor.persistencia.dto.TipoProductoDto;
import servidor.contenedora.listaSimplementeEnlazada.Lista;


public class TestAñadirElementos {

    public static void main(String[] args) {
        new TestAñadirElementos();
    }


    public TestAñadirElementos()
    {

        //Añadir nueva tupla o registro
/*
        Lista<TipoProductoDto> tipoProductosList = new Lista<>();

        tipoProductosList.adicionarAlFinal(new TipoProductoDto(2, "cuentaCorriente"));

        TipoProductoDao tipooProductoDao = new TipoProductoDao();
        tipooProductoDao.insert(tipoProductosList.darPrimero().darData());
*/

        //Leer tablas

        TipoProductoDao tipooProductoDao = new TipoProductoDao();

        Lista<TipoProductoDto> tipoProductosList = tipooProductoDao.read(new TipoProductoDto());

        System.out.println(tipoProductosList.darDataObjetos());






      //  TipoProductoDto tipoProductosDto = new TipoProductoDto();



        //  TipoProductoDto tipoActual = tipoProductosList.darPrimero().darData();
     //   tipooProductoDao.insert(tipoActual);


     //   System.out.println(tipoProductosList.contarElementos());



     //   System.out.println(tipoProductosList.contarElementos());

     //   TipoProductoDto tipoProducto = tipooProductoDao.findById(new TipoProductoDto(1));
      //  System.out.println(tipoProducto);

    }
}
