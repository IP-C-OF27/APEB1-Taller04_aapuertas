import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base,altura,area;
        System.out.print("Deme base: ");
        base = tcl.nextDouble();
        System.out.print("Dame altura: ");
        altura = tcl.nextDouble();
        area= (base * altura) /2;
        System.out.print("Su area es: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN
 * run:
Deme base: 5
Dame altura: 5
Su area es: 12.5BUILD SUCCESSFUL (total time: 2 seconds)
 */


