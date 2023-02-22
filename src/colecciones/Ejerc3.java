/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Servicio.servicioAlumno;

/**
 *
 * @author Asus
 */
public class Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        servicioAlumno serv = new servicioAlumno();
        
        serv.ingresoAlumnos();
        serv.mostrarAlumnos();
        serv.promedioFinal();
    }
    
}
