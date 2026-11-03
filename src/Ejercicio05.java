import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU,
 * teclado, pantalla, ratón."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double CPU,teclado,pantalla,raton,costo;
        System.out.print("Valor del cpu: ");
        CPU=tcl.nextDouble();
        System.out.print("Valor del teclado: ");
        teclado=tcl.nextDouble();
        System.out.print("Valor pantalla: ");
        pantalla=tcl.nextDouble();
        System.out.print("Valor del raton: ");
        raton= tcl.nextDouble();
        costo= CPU+teclado+pantalla+raton;
        System.out.println("Valor total de la computadora de escritorio es: "+ costo);
    }
}
/***
 * EVIDENCIA DEL RUN
run:
Valor del cpu: 60
Valor del teclado: 25
Valor pantalla: 50
Valor del raton: 8
Valor total de la computadora de escritorio es: 143.0
BUILD SUCCESSFUL (total time: 20 seconds)
 */
