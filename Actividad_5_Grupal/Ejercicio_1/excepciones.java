package Actividad_5_Grupal.Ejercicio_1;
/*
 * Esta clase denominada excepciones, lanza diferentes tipos de excepciones
 * en situciones específicas del programa. Los mensajes que se muestran en 
 * pantalla ayuda a identificar la porción de código que se ejecutó o no
 */

 public class excepciones {
    public static void main(String[] args) {
        // Primer bloque try-catch
        try {
            System.out.println("Ingresando al primer try");
            // Esto lanzará una ArithmeticException
            System.out.println("Despues de la división"); //Esta expresión no se ejecutará
        } catch (ArithmeticException e) { //Se captura la excepción
            System.out.println("División por cero");
        } finally {
            System.out.println("Ingresando al primer finally");
        }

        // Segundo bloque try-catch
        try {
        System.out.println("Ingresando al segundo try");
            Object objeto = null;
            objeto.toString(); // Se lanza una excepción
            /* 
            *Esta instrucción nunca será ejecutada porque se lanzó una
            *excepción 
            */
            System.out.println("Imprimiendo objeto");
        } catch (ArithmeticException e) { 
            // La excepción lanzada no es de este tipo 
            System.out.println("División por cero");
        } catch (Exception e) { // Se captura la excepción
            System.out.println("Ocurrió una excepción"); 
            // Se imprime en pantalla este mensaje 
        } finally {
            /* La sentencia finally siempre se ejecuta, ocurra o no una excepción */
            System.out.println("Ingresando al segundo finally");
        }
    }
 }