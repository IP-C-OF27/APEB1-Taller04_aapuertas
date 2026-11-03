import java.util.Scanner;
/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {   
        Scanner tcl = new Scanner(System.in);
        double pre,mo,in;
        System.out.print("Ingres su monto total del prestamo:  ");
        mo= tcl.nextDouble();
        System.out.print("Ingrese el interes mensual:  ");
        in=tcl.nextDouble();
        in= in/100;
        pre= (mo)*((in*(Math.pow(1+in, 12)))/((Math.pow(1+in, 12)-1)));
        System.out.println("Su pago mensual de un prestamo de un anio es: $ "+pre);
    }
}
/***
 * EVIDENCIA DEL RUN
* run:
Ingres su monto total del prestamo:  100
Ingrese el interes mensual:  2
Su pago mensual de un prestamo de un anio es: $ 9.455959662295143
BUILD SUCCESSFUL (total time: 4 seconds)
 */