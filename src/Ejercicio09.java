import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de 
una persona estudiante en una asignatura universitaria a partir de una 
calificación de evaluación continua, una calificación de examen final y un
porcentaje de asistencia. La regla institucional establece que:
*La asistencia mínima debe alcanzarse para ser evaluado
*Existe una nota mínima en el examen final, y
*La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la nota
final redondeada a un decimal."
 * @author Ariel Puertas
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {   
        Scanner tcl = new Scanner(System.in);
        double ec,ef,pa,nf;
        //La asistencia minima es 7, 
        //La nota minima del examen final es 7
        System.out.print("Ingresar el porcentaje de asistencia: ");
        pa=tcl.nextDouble();
        System.out.print("Ingresar nota del Examen final: ");
        ef= tcl.nextDouble();
        if(pa>=7&& ef>=7){
            System.out.printf("La asistencia de %.1f Tiene la Asistencia para ser Evaluado ",pa);
            System.out.print("\nIngresar nota de la Evlauacion Continia: ");
            ec=tcl.nextDouble();
            nf= (ef+ec)/2;
            if (nf>=7){
                System.out.printf("\nNota final= %.1f \nESTADO= APROBADO ",nf);}
            else if(nf<=7 && nf>=5){
                System.out.printf("\nNota final= %.1f \nESTADO= SUPLETORIO ",nf);}
            else {
                System.out.printf("\nNota final= %.1f \nESTADO= REPROBADO ",nf);}
        }else if (pa<7 && ef<7){
            System.out.printf("Asistencia= %.1f \nEvalucion Final= %.1f \n",pa,ef);
            System.out.println("ESTADO=¡REPROBADO¡ NO CUMPLE LOS REQUISITOS MINIMOS ");
        }
        }
    }
/***
 * EVIDENCIAL DEL RUN
run:
Ingresar el porcentaje de asistencia: 9
Ingresar nota del Examen final: 8
Con la asistencia de 9,0 Cumple con la Asistencia para ser Evaluado 
Ingresar nota de la Evlauacion Continia: 8

Nota final= 8,0 
ESTADO= APROBADO BUILD SUCCESSFUL (total time: 5 seconds)
 */