package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

public class ProductoDAO extends DAO {

    public List<Producto> listarNombres() throws Exception {

        List<Producto> productos = new ArrayList();

        try {
            consultarBase("SELECT * FROM producto");

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

    public void crearProducto(Producto producto) throws Exception {

        
        try {
            String sql = "INSERT INTO producto VALUES (" + producto.getCodigo() + ", '" + producto.getNombre() + "', "
                    + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void editarNombre(Producto p) throws Exception{
        
        try {
            String sql = "UPDATE producto SET nombre= '" + p.getNombre() + "' WHERE codigo LIKE " + p.getCodigo();
        insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void editarPrecio(Producto p) throws Exception{
        
        try {
            String sql = "UPDATE producto SET precio= '" + p.getPrecio()+ "' WHERE codigo LIKE " + p.getCodigo();
        insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
  
}


            
            
