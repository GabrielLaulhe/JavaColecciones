/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioAlumno {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Alumno> listaAlumnos;

    public servicioAlumno() {
        this.listaAlumnos = new ArrayList();
    }

    public void ingresoAlumnos() {

        do {
            Alumno alu = new Alumno();
            System.out.println("Ingrese el nombre");
            alu.setNombre(leer.next());

            Integer[] nota = new Integer[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));

                nota[i] = leer.nextInt();
            }
            alu.setNotas(nota);

            listaAlumnos.add(alu);

            System.out.println("Desea seguir agregando alumnos, responder si o no");
            String r = leer.next();
            if (r.equals("no")) {
                break;
            }
        } while (true);
    }

    public void mostrarAlumnos() {

        System.out.println("Los alumnos son: ");
        for (Alumno aux : listaAlumnos) {
            System.out.println(aux);
        }
    }

    public void promedioFinal() {
        float prom = 0;
        System.out.println("Ingrese el nombre del alumno para calcular su nota final");
        String nombreAlu = leer.next();
        Integer[] not = new Integer[3];
        for (Alumno aux : listaAlumnos) {
            if (nombreAlu.equals(aux.getNombre())) {
                not = aux.getNotas();
                for (int i = 0; i < 3; i++) {
                    prom += not[i];
                }
                break;
            }
        }

        prom = prom / 3;

        if (prom == 0) {
            System.out.println("No se encontro el alumno");
        }else {
            System.out.println("El promedio es " + prom);
        }
    }

}
