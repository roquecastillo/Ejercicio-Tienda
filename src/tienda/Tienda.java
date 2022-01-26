/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author Roque
 */
public class Tienda {

    public static void main(String[] args) throws Exception {

        ProductoService pService = new ProductoService();
        FabricanteService fService = new FabricanteService();

        System.out.println("=============BIENVENIDO=============\n"
                + "¿QUÉ DESEA HACER?\n");
        
        int opc = 10;
        
        while(opc != 0){
            
            System.out.println("1) Ver el nombre de todos los productos\n"
                + "2) Ver nombre y precio de los productos\n"
                + "3) Ver productos entre $120 y $202\n"
                + "4) Ver los portátiles\n"
                + "5) Ver nombre y precio del producto más barato\n"
                + "6) Añadir un producto \n"
                + "7) Añadir un fabricante\n"
                + "8) Editar nombre o precio de un producto\n"
                + "0) SALIR");
            
            switch(opc){
                case 1:
                    pService.mostrarNombres();
                    break;
                case 2:
                    pService.mostrarNombresYPrecios();
                    break;
                case 3:
                    pService.mostrarAlgunosPrecios();
                case 4:
                    pService.mostrarPortatiles();
                case 5:
                    pService.mostrarProductoMasBarato();
                case 6:
                    
                    pService.ingresarProducto(opc, nombre, opc, opc);
                    
                        
            }
        }
        
        
        
        
     
      
      
    }

}
