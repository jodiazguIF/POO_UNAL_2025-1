package Ejercicio_Propuesto_4_3;

public class prueba {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jose", "Calle 123", "Ingenieria", 3);
        estudiante.setNombre("Juan");
        System.out.println("Nombre actualizado: " + estudiante.getNombre());
        estudiante.setDireccion("Calle 456");
        System.out.println("Direccion actualizada: " + estudiante.getDireccion());
        estudiante.setCarrera("Arquitectura");
        System.out.println("Carrera actualizada: " + estudiante.getCarrera());
        estudiante.setSemestre(9);
        System.out.println("Semestre actualizado: " + estudiante.getSemestre());
    }
}
