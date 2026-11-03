import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor
a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {   
        Scanner tcl = new Scanner(System.in);
        double pdl1,pdl2,cpk,nkm;
        byte edad;
        System.out.print("Ingrese su edad: ");
        edad=tcl.nextByte();
        System.out.print("Ingrese el valor de costo de kWh:  ");
        cpk= tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos:  ");
        nkm= tcl.nextDouble();
        pdl1=cpk*nkm;
        if(edad>=65){
            pdl2=pdl1*(0.90);
        System.out.println("El costo de su planilla de luz es de: "+ pdl2);
        }else {
        System.out.println("El costo de su planilla de luz es de: "+ pdl1);
        }
    }
}
/***
 * EVIDENCIAL DEL RUN
run:
Ingrese su edad: 65
Ingrese el valor de costo de kWh:  0,095
Ingrese el numero de kilovatios consumidos:  200
El costo de su planilla de luz es de: 17.1
BUILD SUCCESSFUL (total time: 14 seconds)
 */