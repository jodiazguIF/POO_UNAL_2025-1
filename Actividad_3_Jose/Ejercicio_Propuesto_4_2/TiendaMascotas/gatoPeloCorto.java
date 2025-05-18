package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class gatoPeloCorto extends gato {
    protected enum raza_PeloCorto { //Visibles para el paquete y todas las subclases
        AZUL_RUSO,
        BRITANICO,
        DEVON_REX,
        MANX,
    }
    raza_PeloCorto raza; //Se asigna raza como un enum definido por raza
    // Constructor
    public gatoPeloCorto(String nombre, int edad, String color, float altura_salto, float longitud_salto, tipoPelaje tipoPelaje, raza_PeloCorto raza) {
        super(nombre, edad, color, altura_salto, longitud_salto, tipoPelaje);
        this.raza = raza;
    }
    // Método para mostrar información de la mascota
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase padre
        System.out.println("Raza: " + raza);
    }
}
