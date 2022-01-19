package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

public class ProductoDAO extends DAO {

    public List<Producto> listarNombres() throws Exception {

        List<Producto> productos = new ArrayList();

        try {
            consultarBase("SELECT nombre FROM producto");

            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return productos;
    }

}