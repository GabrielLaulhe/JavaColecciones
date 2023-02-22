/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import static colecciones.Ejerc6.leer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import java.util.TreeSet;

/**
 *
 * @author Asus
 */
public class servicioPais {

    TreeSet<String> paises;

    public servicioPais() {
        this.paises = new TreeSet();
    }

    public void cargarPaises() {

        do {
            System.out.println("Por favor ingrese el pais");
            paises.add(leer.next());

            System.out.println("Desea seguir agregando paises? S/N");
            String r = leer.next();

            if (r.equalsIgnoreCase("n")) {
                mostrarPaises();
                break;
            }

        } while (true);
    }

    public void mostrarPaises() {
        paises.forEach((aux) -> {
            System.out.println(aux);
        });
    }

    public void eliminarPais() {

        System.out.println("Que pais desea eliminar?");
        String pais = leer.next();

        if (paises.contains(pais)) {
            paises.remove(pais);
            System.out.println("");
            mostrarPaises();
        } else {
            System.out.println("El pais ingresado no esta en la lista");
        }
    }

    public void eliminarOtroPais() {
        System.out.println("Que otro pais desea eliminar?");
        String pais = leer.next();
        
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equals(pais)) {
                it.remove();
                System.out.println("");
                mostrarPaises();
                break;
            }if (!(it.hasNext())) {
                System.out.println("El pais ingresado no esta en la lista");
            }

        }

    }
}
