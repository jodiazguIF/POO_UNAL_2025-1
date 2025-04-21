package Actividad_1_Jose;
import java.util.Scanner;

public class Ejercicio_No32 {
    public static void main(String[] args) {
        /* Para este ejercicio vamos a usar una entrada; la cantidad de escritorios a comprar */
        Scanner entrada = new Scanner(System.in); // Scanner para la entrada de datos
        System.out.print("Ingrese la cantidad de escritorios a comprar: ");
        int cantidad_Escritorios = entrada.nextInt(); // Cantidad de escritorios a comprar
        entrada.close(); // Cerrar el scanner
        float precio_Escritorio = 800000; // Precio de cada escritorio
        float total_Pagar = 0; //Variable para almacenar el total a pagar
        /*Ahora se procede a realziar la lógica del ejercicio */
        if(cantidad_Escritorios < 5){
            total_Pagar = cantidad_Escritorios *precio_Escritorio *0.9f; // Descuento del 10% si es menor de 5 unidades
            //si no se cumple esta condición se avanza con el siguiente bloque, else if
        }else if(cantidad_Escritorios < 10){
            total_Pagar = cantidad_Escritorios *precio_Escritorio *0.8f; // Descuento del 20% si es menor de 10 unidades pero mayor o igual a 5
            //si no se cumple esta condición se avanza con el siguiente bloque, else if
        }else if(cantidad_Escritorios >= 10) {
            total_Pagar = cantidad_Escritorios *precio_Escritorio *0.6f; // Descuento del 40% si es mayor o igual a 10 unidades
        }
        System.out.println("El total a pagar es: $" + total_Pagar); // Se imprime el valor total a pagar con el descuento aplicado
    }
}
