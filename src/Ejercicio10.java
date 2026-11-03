import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se 
compone de un cuadrado perfecto ( A ), tres triángulos rectángulos iguales 
( B , C , E ), cuya base mide lo mismo que uno de los lados del cuadrado, y 
un rectángulo ( D ) cuyo ancho mide lo mismo que uno de los lados del cuadrado,
mientras que la altura mide lo mismo que la altura de los triángulos. Se pide 
que haga un programa que calcule el área total. Por cultura general, sabemos 
que el área de un rectángulo se calcula multiplicando su base por su altura;
el área de un triángulo rectángulo se calcula multiplicando su base por su
altura, y luego dividiendo el resultado entre dos; Finalmente, el área de un
cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {   
        Scanner tcl = new Scanner(System.in);
        double ladoCua, alturaTri,areaCua, areaTri, areaRec, areaTotal;
        System.out.print("Ingrese la medida del lado del cuadrado: ");
        ladoCua = tcl.nextDouble();
        System.out.print("Ingrese la medida de la altura: ");
        alturaTri = tcl.nextDouble();
        areaCua = Math.pow(ladoCua, 2);
        areaTri = (ladoCua * alturaTri) / 2.0;
        areaRec = ladoCua * alturaTri;
        areaTotal = areaCua + (3 * areaTri) + areaRec;
        System.out.printf("Area del cuadrado: %.2f%n", areaCua);
        System.out.printf("Area de un triangulo: %.2f%n", areaTri);
        System.out.printf("Area del rectangulo: %.2f%n", areaRec);
        System.out.printf("El area total del poligono es: %.2f%n", areaTotal);
    }
}
/***
 * EVIDENCIAL DEL RUN
run:
Ingrese la medida del lado del cuadrado: 5
Ingrese la medida de la altura: 6
Area del cuadrado: 25,00
Area de un triangulo: 15,00
Area del rectangulo: 30,00
El area total del poligono es: 100,00
BUILD SUCCESSFUL (total time: 3 seconds)
 */