package Actividad_1_Jose;
import java.util.Scanner; 

public class Ejercicio_No33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Responde adecuadamente las preguntas para ganar el juego");
        System.out.println("¿Simón Bolivar libertó a Colombia?");
        String respuesta = entrada.nextLine(); //Se recibe la respuesta a la primera pregunta
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Correcto, vamos a la siguiente pregunta");
            System.out.println("¿Camilo Torres fue un guerrillero?");
            respuesta = entrada.nextLine(); //Se recibe la respuesta a la segunda pregunta
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Correcto, vamos a la siguiente pregunta");
                System.out.println("¿El binomio de oro es un grupo de música vallenata?");
                respuesta = entrada.nextLine(); //Se recibe la respuesta a la tercera pregunta
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("Correcto, has ganado el juego");
                }else{
                    System.out.println("Incorrecto, has perdido el juego");
                }
        }else{
            System.out.println("Incorrecto, has perdido el juego");
        }
        }else{
        System.out.println("Incorrecto, has perdido el juego");
        }
        entrada.close(); //Se cierra el escáner
        // Fin del juego
    }
}
