package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class perroMediano extends perro {
    enum raza_Mediano{
        COLLIE,
        DALMATA,
        BULDOG,
        GALGO,
        SABUESO,
    };
    raza_Mediano raza; //Se asigna raza como un enum definido por raza
    //constructor
    public perroMediano(String nombre, int edad, String color, float peso, boolean muerde, tamano tamano, raza_Mediano raza) {
        super(nombre, edad, color, peso, muerde, tamano);
        this.raza = raza;
    }
    //método para imprimir información de la mascota
    public void imprimir() {
        super.imprimir(); //llama al método imprimir de la clase padre
        System.out.println("Raza: " + raza);
    }
    
}
