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
       
       tiendaService.mostrarNombres();
    }
    
}
