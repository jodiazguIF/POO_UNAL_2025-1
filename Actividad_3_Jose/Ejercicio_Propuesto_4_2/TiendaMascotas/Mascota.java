package Ejercicio_Propuesto_4_2.TiendaMascotas;
/*
 * Clase raíz para la jerarquía de mascotas.
 */

public class Mascota {
    public String nombre;
    public int edad;
    public String color;

    //constructor
    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    //método para mostrar información de la mascota
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Color: " + color);
    }
}
