package Actividad_1_Jose;
import java.util.Scanner;

public class Ejercicio_No15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Scanner para la entrada de datos
        System.out.println("Ingrese peso de las esferas: ");
        int peso_A = entrada.nextInt(); // Peso de la primera esfera
        int peso_B = entrada.nextInt(); // Peso de la segunda esfera
        int peso_C = entrada.nextInt(); // Peso de la tercera esfera
        int peso_D = entrada.nextInt(); // Peso de la cuarta esfera
        String esfera_Diferente; // Variable para almacenar la esfera diferente
        String esfera_DiferenteComparacionPeso; // Aquí se almacenará si la esfera debe es más o menos pesada
        entrada.close(); // Cerrar el scanner
        /*Ahora vamos a realizar la comparación */
        if(peso_A == peso_B && peso_A == peso_C){
            esfera_Diferente = "D"; // La esfera diferente es la D
            if (peso_D > peso_A){
                esfera_DiferenteComparacionPeso = "mayor"; // La esfera diferente es más pesada
            }else{
                esfera_DiferenteComparacionPeso = "menor"; // La esfera diferente es más ligera
            }
        }else if(peso_A == peso_B && peso_A == peso_D){
            esfera_Diferente = "C"; // La esfera diferente es la C
            if (peso_C > peso_A){
                esfera_DiferenteComparacionPeso = "mayor"; // La esfera diferente es más pesada
            }else{
                esfera_DiferenteComparacionPeso = "menor"; // La esfera diferente es más ligera
            }
        }else if(peso_A == peso_C && peso_A == peso_D){
            esfera_Diferente = "B"; // La esfera diferente es la B
            if (peso_B > peso_A){
                esfera_DiferenteComparacionPeso = "mayor"; // La esfera diferente es más pesada
            }else{
                esfera_DiferenteComparacionPeso = "menor"; // La esfera diferente es más ligera
            }
        }else{
            esfera_Diferente = "A"; // La esfera diferente es la A
            if (peso_A > peso_B){
                esfera_DiferenteComparacionPeso = "mayor"; // La esfera diferente es más pesada
            }else{
                esfera_DiferenteComparacionPeso = "menor"; // La esfera diferente es más ligera
            }
        }
        /*Ya se realizó la comparación y se averiguó cuál es la esfera diferente y si es más o menos pesada que las otras*/
        System.out.println("La esfera " + esfera_Diferente + " es la diferente y es de " + esfera_DiferenteComparacionPeso + " peso");
    }
}
