package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class perroPequeno extends perro {
    enum raza_Pequeno{
        CHIHUAHUA,
        CANICHE,
        YORKSHIRE_TERRIER,
        SCHAUZER,
    };
    raza_Pequeno raza; //Se asigna raza como un enum definido por raza
    //constructor
    public perroPequeno(String nombre, int edad, String color, float peso, boolean muerde, tamano tamano, raza_Pequeno raza) {
        super(nombre, edad, color, peso, muerde, tamano);
        this.raza = raza;
    }
    //método para imprimir información de la mascota
    public void imprimir() {
        super.imprimir(); //llama al método imprimir de la clase padre
        System.out.println("Raza: " + raza);
    }
    
}
