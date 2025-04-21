package Actividad_1_Jose; // Se declara el paquete Actividad_1 al inicio del archivo para que coincida con el paquete esperado.
import java.util.Scanner; // Se importa la clase Scanner para leer la entrada del usuario

public class Ejercicio_No10 {
    public static void main(String[] args){
        /*Se empieza recopilando los datos de la persona */
        float pago_Matricula; //Se declara esta variable al inicio para que sea accesible en toda la función y no solamente en los if, else
        Scanner entrada = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese su número de inscripción: "); // Se solicita el número de inscripción
        int numeroInscripcion = entrada.nextInt(); // Se lee el número de inscripción dado por el scanner
        System.out.print("Ingrese su nombre completo: "); // Se solicita el nombre
        String nombre = entrada.next(); // Se lee el nombre dado por el scanner 
        System.out.print("Ingrese su patrimonio: "); // Se solicita el patrimonio
        int patrimonio = entrada.nextInt(); // Se lee el patrimonio dado por el scanner
        System.out.print("Infrese su estrato social: "); // Se solicita el estrato social
        int estrato_Social = entrada.nextInt(); // Se lee el estrato social dado por el scanner
        /*Una vez con los datos, se procede a realizar el ejercicio con los condicionales*/
        if(patrimonio <= 2000000 && estrato_Social <= 3){
            pago_Matricula = 50000;
        }else{
            pago_Matricula = 50000 + 0.03f *patrimonio; //Se añade el f para especificar que 0.03 es un float
        }
        System.out.println("El estudiante con número de inscripción " + numeroInscripcion + " y nombre " + nombre + " debe pagar $" + pago_Matricula);
        entrada.close(); // Se cierra el objeto Scanner para liberar recursos
    }
}
