/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.servicios.ProductoService;

/**
 *
 * @author Roque
 */
public class Tienda {

    
    public static void main(String[] args) throws Exception {
        
       ProductoService tiendaService = new ProductoService();
       
       //tiendaService.mostrarNombres();
       
       
       //tiendaService.mostrarAlgunosPrecios();
       //tiendaService.mostrarPortatiles();
       //tiendaService.mostrarProductoMasBarato();
       tiendaService.ingresarProducto(44, "Equipo RCA Inalámbrico",600.2 , 444);
        System.out.println();
       tiendaService.mostrarNombresYPrecios();
    }
    
}
