/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioMascota {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private List<String> razas;

    public servicioMascota() {
        this.razas = new ArrayList();
    }

    public void crearRaza() {

        System.out.println("Ingrese la raza");
        String raza = leer.next();
        razas.add(raza);

    }

    public void mostrarRazas() {

        System.out.println("Las razas son: ");
        for (String aux : razas) {
            System.out.println(aux);
        }

    }

    public void eliminarRaza() {

        System.out.println("Que raza desea eliminar?");
        String r = leer.next();
        if (razas.contains(r)) {
            System.out.println("La raza fue eliminada");
            Iterator it = razas.iterator();

            while (it.hasNext()) {
                if (it.next().equals(r)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("La raza no se encuentra en la lista");
        }
        Collections.sort(razas);
    }
}
