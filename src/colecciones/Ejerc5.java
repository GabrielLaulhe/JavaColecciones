/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Servicio.servicioPais;

/**
 *
 * @author Asus
 */
public class Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioPais serv = new servicioPais();
        
        serv.cargarPaises();
        
        serv.eliminarPais();
        
        serv.eliminarOtroPais();
    }
    
}
