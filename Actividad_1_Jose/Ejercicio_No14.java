package Actividad_1_Jose;

import java.util.Scanner;

public class Ejercicio_No14 {
    public static void main(String[] args) {
        /*Primero vamos a recopilar los datos de cada departamento */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1: ");
        int departamento_1Ventas = entrada.nextInt();
        System.out.println("Ingrese las ventas del departamento 2: ");
        int departamento_2Ventas = entrada.nextInt();
        System.out.println("Ingrese las ventas del departamento 3: ");
        int departamento_3Ventas = entrada.nextInt();
        float departamento_1Salario ;
        float departamento_2Salario ;
        float departamento_3Salario ;
        System.out.println("Ingrese el salario de los vendedores: ");
        float salario = entrada.nextFloat();
        entrada.close();
        /*Ahora vamos a calcular el salario de cada departamento de acuerdo al porcentaje de ventas de cada uno*/
        int ventas_Totales = departamento_1Ventas + departamento_2Ventas + departamento_3Ventas;
        if (departamento_1Ventas > 0.33f *ventas_Totales){
            departamento_1Salario = salario + 0.2f * salario;
        }else{ 
            departamento_1Salario = salario;
        }
        if (departamento_2Ventas > 0.33f *ventas_Totales){
            departamento_2Salario = salario + 0.2f * salario;
        }else{ 
            departamento_2Salario = salario;
        }
        if (departamento_3Ventas > 0.33f *ventas_Totales){
            departamento_3Salario = salario + 0.2f * salario;
        }else{
            departamento_3Salario = salario;
        }
        /*Ahora vamos a imprimir el salario de cada departamento*/
        System.out.println("Salario vendedores depto. 1, $" + departamento_1Salario +
         " salario depto. 2, $" + departamento_2Salario + " salario depto. 3, $" + departamento_3Salario);
    }
}
