package Actividad_1;
import java.util.Scanner;

public class Ejercicio_No12 {
    public static void  main(String args[]){
        Scanner entrada = new Scanner(System.in); // Se importa la clase Scanner para leer la entrada del usuario
        /*Ahora se procede a recolectar los datos necesarios por parte del trabajador */
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.next(); // Se solicita el nombre
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int horas_Trabajadas = entrada.nextInt(); // Se solicita la cantidad de horas trabajadas
        System.out.print("Ingrese el valor de la hora normal trabajada: ");
        int valor_HoraNormal = entrada.nextInt(); // Se solicita el valor de la hora normal
        /*Una vez recolectados los datos necesarios se procede a realizar la lógica del cálculo del salario*/
        entrada.close(); // Se cierra el objeto Scanner para liberar recursos
        int salario; //Se declara la variable salario para que sea accesible en toda la función
        if (horas_Trabajadas > 40){
            salario = 40 * valor_HoraNormal; 
            horas_Trabajadas-=40; //Se le resta 40 horas a las horas trabajadas
            if (horas_Trabajadas > 8){
                salario += 8*valor_HoraNormal*2; //Se le suma el valor de las horas extras que no exceden de 8
                horas_Trabajadas-=8; //Se le resta 8 horas a las horas trabajadas
                salario+= horas_Trabajadas*valor_HoraNormal*3; //Se le suma el valor de las horas extras que exceden de 8
            }else{
                salario+= horas_Trabajadas*valor_HoraNormal*2; //Se le suma el valor de las horas extras que no exceden de 8
            }
        }else{
            salario = horas_Trabajadas*valor_HoraNormal; //Se le suma el valor de las horas trabajadas pues no excede las 40 horas
        }
        System.out.println("El trabajador " + nombre + " devengó: $" + salario); //Se imprime el resultado final
    }
}
