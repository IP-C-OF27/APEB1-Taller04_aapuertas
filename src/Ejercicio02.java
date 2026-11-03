import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double hijo1,hijo2,hijo3,gasto_total;
        System.out.print("Gasto del hijo numero 1: ");
        hijo1 =tcl.nextDouble();
        System.out.print("Gasto del hijo numero 2: ");
        hijo2 =tcl.nextDouble();
        System.out.print("Gato del hijo numero 3: ");
        hijo3 =tcl.nextDouble();
        gasto_total= hijo1+hijo2+hijo3;
        System.out.println("El gasto total es: "+ gasto_total);
    }
}
/***
 * EVIDENCIA DEL RUN
 * run:
Gasto del hijo numero 1: 2
Gasto del hijo numero 2: 2
Gato del hijo numero 3: 2
El gasto total es: 6.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */

