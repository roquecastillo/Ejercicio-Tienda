

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
            System.out.println(producto.getNombre());
        }
    }
    
     public void mostrarNombresYPrecios() throws Exception{
        
        List<Producto> productos = listarNombres();
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " / PRECIO: $" + producto.getPrecio());
        }
    }
    
    public void mostrarAlgunosPrecios() throws Exception{
        
        List<Producto> productos = listarNombres();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= 120 && producto.getPrecio() <= 202) {
                System.out.println(producto.getNombre());
            }
            
        
        }
    }
    
    public void mostrarPortatiles() throws Exception{
        
        List<Producto> productos = listarNombres();
        for (Producto producto : productos) {
            if (producto.getNombre().contains("Portátil")) {
                System.out.println(producto.getNombre());
            }
            
        
        }
    }
    
    public void mostrarProductoMasBarato() throws Exception{
        List<Producto> productos = listarNombres();
        Producto barato = productos.get(0);
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getPrecio() < barato.getPrecio()) {
                barato = productos.get(i);
            }
        }
        System.out.println(barato.getNombre() + " / PRECIO: " + barato.getPrecio());
    }
    
    public void ingresarProducto(int codigo, String nombre, double precio, int codigo_fabricante) throws Exception{
        
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCodigoFabricante(codigo_fabricante);
        
        dao.crearProducto(producto);
    }
    

}
