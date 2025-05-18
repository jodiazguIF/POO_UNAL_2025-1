package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class perro extends Mascota {
    enum tamano {
        PEQUENO, 
        MEDIANO,
        GRANDE
    }
    tamano tamano; //Se asigna tamano como un enum definido por tamano
    float peso;
    boolean muerde;


    //constructor
    public perro(String nombre, int edad, String color, float peso, boolean muerde, tamano tamano) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.tamano = tamano;
    }

    //método estático sonido
    public static void sonido() {
        System.out.println("Los perros ladran");
    }

    //método para mostrar información de la mascota
    public void imprimir() {
        super.imprimir(); //llama al método imprimir de la clase padre
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Muerde: " + (muerde ? "Sí" : "No"));
        System.out.println("Tamaño: " + tamano);
    }
}
