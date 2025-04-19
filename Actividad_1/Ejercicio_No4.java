package Actividad_1;

//1. Se definen los paquetes
// Se debe declarar el paquete Actividad_1 al inicio del archivo para que coincida con el paquete esperado.
import java.util.Scanner;

public class Ejercicio_No4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese la edad de Juan: "); // Se solicita la edad de Juan
        float edad_Juan = entrada.nextFloat(); // Se lee la edad de Juan dada por el scanner
        float edad_Alberto = 2*edad_Juan/3; // Alberto es 2/3 de la edad de Juan
        float edad_Ana = 4/3 * edad_Juan; // Ana es 4/3 de la edad de Juan
        float edad_Mama = edad_Alberto + edad_Ana + edad_Juan; // La edad de la madre es la suma de las edades de los hijos
        System.out.println("Las edades son: Juan " + edad_Juan + 
        " Alberto " + edad_Alberto + " Ana " + edad_Ana + " Madre " + edad_Mama);
        entrada.close(); // Se cierra el escáner
    }
}