package Actividad_1_Jose;
import java.util.Scanner; // Se importa la clase Scanner para leer la entrada del usuario

public class Ejercicio_No11{
    public static void main(String args[]){
        /*Se deben recibir tres variables enteras para su comparación */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los 3 números que desee comparar: "); // Se solicita el primer número
        int primer_Numero = entrada.nextInt(); // Se lee el primer número dado por el scanner
        int segundo_Numero = entrada.nextInt(); // Se lee el segundo número dado por el scanner
        int tercer_Numero = entrada.nextInt(); // Se lee el tercer número dado por el scanner
        entrada.close(); // Se cierra el objeto Scanner para liberar recursos
        int mayor; // Se declara la variable mayor para almacenar el número mayor
        /*Una vez recibidos los datos se procede a hacer la comparación */
        if(primer_Numero > segundo_Numero && primer_Numero > tercer_Numero){
            mayor = primer_Numero; // Se asigna el valor del primer número a la variable mayor
        }else{
            if(segundo_Numero > tercer_Numero){
                mayor = segundo_Numero; // Se asigna el valor del segundo número a la variable mayor
            }else{
                mayor = tercer_Numero; // Se asigna el valor del tercer número a la variable mayor
            }
        }
        /*Se imprime el resultado */
        System.out.println("El valor mayor entre: " + primer_Numero + ", " + segundo_Numero + " y " + tercer_Numero + " es: " + mayor);
    }
}