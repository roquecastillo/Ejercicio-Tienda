

package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Fabricante;


public class FabricanteDAO extends DAO {

    public Fabricante buscarPorCodigo(int codigo) throws Exception {
        Fabricante fabricante = new Fabricante();
        try {
            String sql = "SELECT * FROM fabricante WHERE codigo = " + codigo;
            consultarBase(sql);
            while (resultado.next()){
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
        } catch (Exception e) {
            throw e;
        }
        return fabricante;
    }
    
    public void crearFabricante(Fabricante f) throws Exception{
        
        
        
        try {
            String sql = "INSERT INTO fabricante VALUES (" + f.getCodigo() + ", '" + f.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }

}
    
    public List<Fabricante> listarFabricantes() throws Exception {

        List<Fabricante> fabricantes = new ArrayList();

        try {
            consultarBase("SELECT * FROM fabricante");

            while (resultado.next()) {
                Fabricante f = new Fabricante();
               f.setCodigo(resultado.getInt(1));
               f.setNombre(resultado.getString(2));
                
               fabricantes.add(f);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        return fabricantes;
    }
}
    


 

                
                
            
            
                
        
            
            
    
