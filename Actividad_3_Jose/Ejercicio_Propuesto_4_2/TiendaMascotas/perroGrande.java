package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class perroGrande extends perro {
    enum raza_Grande{
        PASTOR_ALEMAN,
        DOBERMAN,
        ROTTWEILER,
    };
    raza_Grande raza; //Se asigna raza como un enum definido por raza
    //constructor
    public perroGrande(String nombre, int edad, String color, float peso, boolean muerde, tamano tamano, raza_Grande raza) {
        super(nombre, edad, color, peso, muerde, tamano);
        this.raza = raza;
    }
    //método para imprimir información de la mascota
    public void imprimir() {
        super.imprimir(); //llama al método imprimir de la clase padre
        System.out.println("Raza: " + raza);
    }
}
