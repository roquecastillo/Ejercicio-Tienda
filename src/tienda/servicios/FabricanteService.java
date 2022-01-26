package tienda.servicios;

import java.util.List;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {

    public FabricanteDAO dao;

    public FabricanteService() {
        dao = new FabricanteDAO();
    }

    public void ingresarFabricante(int codigo, String nombre) throws Exception {

        Fabricante f = new Fabricante();
        f.setCodigo(codigo);
        f.setNombre(nombre);

        dao.crearFabricante(f);
    }

    public void mostrarFabricantes() throws Exception {
        List<Fabricante> fabricantes = dao.listarFabricantes();
        for (Fabricante fabricante : fabricantes) {
            System.out.println("CÓDIGO: " + fabricante.getCodigo() + "\n"
                    + "NOMBRE: " + fabricante.getNombre() + "\n"
                    + "------------------------------------------");

        }
    }

}
