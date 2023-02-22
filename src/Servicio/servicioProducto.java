/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioProducto {

    Scanner leer = new Scanner(System.in);

    HashMap<String, Integer> producto;

    public servicioProducto() {
        this.producto = new HashMap();
    }

    public void introducirProducto() {

        do {
            System.out.println("----------Ingreso del Producto----------");
            System.out.println("Ingrese el nombre producto");
            String prod = leer.next();
            System.out.println("Ingrese el precio");
            int precio = leer.nextInt();

            producto.put(prod, precio);

            System.out.println("Desea ingresar otro producto? Ingrese S/N");
            String r = leer.next();
            if ((r.equalsIgnoreCase("N"))) {
                break;
            }

        } while (true);
    }

    public void modificarPrecio() {

        System.out.println("------Modificar precio de producto-----");
        System.out.println("Ingrese el producto para modificar su precio");
        String resp = leer.next();
        if (producto.containsKey(resp)) {
            System.out.println("Ingrese el precio");
            Integer pr = leer.nextInt();
            producto.replace(resp, pr);
        } else {
            System.out.println("El producto no existe");
        }

    }

    public void eliminarProducto() {

        System.out.println("-----Eliminar Producto-----");
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String resp = leer.next();
        if (producto.containsKey(resp)) {
            producto.remove(resp);

        } else {
            System.out.println("El producto no existe");
        }

    }

    public void mostrarProductos() {

        for (Map.Entry<String, Integer> prod : producto.entrySet()) {
            String key = prod.getKey();
            Integer value = prod.getValue();
            System.out.println("Producto: " + key + " Precio: " + value);
        }

    }

    public void menu() {
        boolean salir = false;

        do {

            System.out.println("---------MENU--------");
            System.out.println("Opcion 1: Ingresar producto");
            System.out.println("Opcion 2: Modificar precio");
            System.out.println("Opcion 3: Eliminar producto");
            System.out.println("Opcion 4: mostrarProducto");
            System.out.println("Opcion 5: Salir");
            System.out.println("");
            System.out.println("Ingrese una opcion");
            int op = leer.nextInt();

            switch (op) {

                case 1:
                    introducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (!salir);

    }
}
