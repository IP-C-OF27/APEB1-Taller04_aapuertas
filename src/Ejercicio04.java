import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double valo_casa,costo_minu,num_min;
        System.out.print("Ingrese costo por minutos: ");
        costo_minu =tcl.nextDouble();
        System.out.print("Ingrese el numero de minutos consumidos en el mes: ");
        num_min =tcl.nextDouble();
        valo_casa= costo_minu*num_min;
        System.out.println("Valor de plantilla de telefono de su casa es: "+ valo_casa);
    }
}
/***
 * EVIDENCIA DEL RUN
run:
Ingrese costo por minutos: 25
Ingrese el numero de minutos consumidos en el mes: 25
Valor de plantilla de telefono de su casa es: 625.0
BUILD SUCCESSFUL (total time: 3 seconds)
 */