/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Entidades.Mascotas;
import Servicio.servicioMascota;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        servicioMascota serv = new servicioMascota();

        String respuesta;
        serv.crearRaza();

        do {
            System.out.println("quiere ingresar otra raza? ingrese si o no");
            respuesta = leer.next();
            if ("si".equals(respuesta)) {
                serv.crearRaza();

            } else {
                break;
            }
        } while (true);

        serv.mostrarRazas();
        serv.eliminarRaza();
        serv.mostrarRazas();
    }

}
