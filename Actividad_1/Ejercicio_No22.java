package Actividad_1;
import java.util.Scanner;

public class Ejercicio_No22 {
    public static void main(String[] args) {
        /*Primero se van a recibir los datos de entrada */    
        Scanner entrada = new Scanner(System.in); // Scanner para la entrada de datos
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine(); // Nombre del empleado
        System.out.print("Ingrese el salario básico por hora: ");
        float valor_Hora = entrada.nextFloat(); // Salario básico por hora
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horas_Trabajadas = entrada.nextInt(); // Número de horas trabajadas 
        entrada.close(); // Cerrar el scanner
        /*Se procede a realizar la lógica del ejercicio */
        float salario = horas_Trabajadas * valor_Hora; // Salario total
        if ( salario > 450000){
            System.out.println("El empleado " + nombre + " tiene un salario de $" + salario);
        }else{
            System.out.println("El empleado " + nombre);
        }
    }
}
