import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar
el valor total a pagar mensual de servicios digitales de una persona. Los 
servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la
persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {   
        Scanner tcl = new Scanner(System.in);
        double total1,total2,net,you,drop,spot,edad;
        System.out.print("Ingrese su Edad: ");
        edad=tcl.nextDouble();
        System.out.print("Ingrese el valor de Netflix: ");
        net=tcl.nextDouble();
        System.out.print("Ingrese el valor de Youtube Premiun: ");
        you=tcl.nextDouble();
        System.out.print("Ingrese el valor de DropBox: ");
        drop=tcl.nextDouble();
        System.out.print("Ingrese el valor de Spotify: ");
        spot=tcl.nextDouble();
        total1=net+you+drop+spot;
        total2=total1*(0.80);
        if (edad<=30){
            System.out.println("El valor en total a pagar es: " +total2);
        } else{
            System.out.println("El valor en total a pagar es:" + total1);
        }
    }
}
/***
 * EVIDENCIAL DEL RUN
run:
Ingrese su Edad: 29
Ingrese el valor de Netflix: 5
Ingrese el valor de Youtube Premiun: 5
Ingrese el valor de DropBox: 5
Ingrese el valor de Spotify: 5
El valor en total a pagar es: 16.0
BUILD SUCCESSFUL (total time: 13 seconds)
 */