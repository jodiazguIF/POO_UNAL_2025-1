package Actividad_1_Jose;    //Se define el paquete para que coincida con el paquete esperado
/* En este programa se da uso del condicional if ingresando 4 variables y realizando operaciones lógicas entre ellas*/
 import java.util.Scanner; // Se importa la clase Scanner para leer la entrada del usuario

 public class Ejercicio_No9{
    public static void main(String[] args){
        byte CONSTANTE_X = 5; // Se declara la variable CONSTANTE_X como byte para ahorrar espacio de memoria
        Scanner entrada = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Ingrese el valor de Y:"); // Se solicita el valor de Y
        float CONSTANTE_Y = entrada.nextFloat(); // Se lee el valor de Y
        System.out.print("Ingrese el valor de A:"); // Se solicita el valor de A
        float CONSTANTE_A = entrada.nextFloat(); // Se lee el valor de A
        System.out.print("Ingrese el valor de B:"); // Se solicita el valor de B
        float CONSTANTE_B = entrada.nextFloat(); // Se lee el valor de B
        System.out.print("Ingrese el valor de C:"); // Se solicita el valor de C
        float CONSTANTE_C = entrada.nextFloat(); // Se lee el valor de C
        /* Una vez adquirido el valor de las constantes se procede a hacer la comparación lógica entre ellas */
        if (CONSTANTE_Y < CONSTANTE_A && (CONSTANTE_A < CONSTANTE_B && CONSTANTE_B < CONSTANTE_C)) {
            CONSTANTE_X = 0;
        }else if(CONSTANTE_A <= CONSTANTE_Y && CONSTANTE_Y < CONSTANTE_B){
            CONSTANTE_X = 1;
        }else if(CONSTANTE_B <= CONSTANTE_Y && CONSTANTE_Y < CONSTANTE_C) {
            CONSTANTE_X = 2;
        }else if(CONSTANTE_C <= CONSTANTE_Y){
            CONSTANTE_X = 3;
        }else{
            CONSTANTE_X = 4;
        }
        System.out.println("El valor de X es: " + CONSTANTE_X); // Se imprime el valor de X
        entrada.close(); // Se cierra el escáner
    }
 } 