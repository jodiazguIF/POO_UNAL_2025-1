package Ejercicio_3;
import java.util.*;

public class CálculosNuméricos {

    static double calcularLogaritmoNeperiano(double valor) {

        double resultado = 0;

        try {
            if (valor < 0) {
                // Si el valor es negativo, se genera una excepción aritmética

                throw new ArithmeticException("El valor debe ser un número positivo");

            }

            resultado = Math.log(valor);

        } catch (ArithmeticException e) {

            System.out.println("El valor debe ser un número positivo para calcular el logaritmo");

            //En caso de error ingresar negativo
            resultado = -404;

        } catch (InputMismatchException e) {

            System.out.println("El valor debe ser numérico para calcular el logaritmo");

        }

        return resultado;

    }

    static double calcularRaízCuadrada(double valor) {

        double resultado = 0;

        try {
            if (valor < 0) {

                throw new ArithmeticException("El valor debe ser un número positivo");
            }

            resultado = Math.sqrt(valor);

        } catch (ArithmeticException e) {

            System.out.println("El valor debe ser un número positivo para calcular la raíz cuadrada");

            //En caso de error ingresar negativo
            resultado = -404;

        } catch (InputMismatchException e) {

            System.out.println("El valor debe ser numérico para calcular la raíz cuadrada");
        }

        return resultado;
    }


}
