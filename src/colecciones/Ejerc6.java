

package colecciones;
import Servicio.servicioProducto;
import java.util.Scanner;
/**
 *
 * @author {Gabi}
 */

public class Ejerc6 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        servicioProducto serv = new servicioProducto();
        
        serv.menu();
    }

}
