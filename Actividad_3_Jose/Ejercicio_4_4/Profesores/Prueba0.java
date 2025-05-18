package Ejercicio_4_4.Profesores;

public class Prueba0 {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 = (Profesor) profesor1;
        Profesor profesor3 = new Profesor();
        profesor1.imprimir();
        profesor2.imprimir();
        profesor3.imprimir();
    }
}
