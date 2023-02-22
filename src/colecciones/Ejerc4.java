/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Servicio.ServicePelicula;

/**
 *
 * @author Asus
 */
public class Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicePelicula serv = new ServicePelicula();
       
        serv.cargarPeliculas();
        serv.mostrarPeliculas();
        
        System.out.println("");
        
        serv.mostrarPeliculasMasHora();
        
        System.out.println("");
        
        serv.ordenarDuracion();
        System.out.println("");
        serv.mostrarPeliculas();
        serv.ordenarDuracionMenor();
        System.out.println("");
        serv.mostrarPeliculas();
        
        System.out.println("");
        serv.ordenarTitulos();
        serv.mostrarPeliculas();
       
        System.out.println("");
        serv.ordenarDirector();
        serv.mostrarPeliculas();
    }
}
