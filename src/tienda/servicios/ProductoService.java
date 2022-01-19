

package tienda.servicios;

import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;


public class ProductoService {
    
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }
    
    public List<Producto> listarNombres() throws Exception{
        
        List<Producto> productos = dao.listarNombres();
        
        return productos;
        
    }
    
    public void mostrarNombres() throws Exception{
        
        List<Producto> productos = listarNombres();
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
    }
    
    

}
