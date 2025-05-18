package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class gatoSinPelo extends gato {
    enum raza_SinPelo{
        ESFINGE,
        ELFO,
        DONSKEY,
    } 
    raza_SinPelo raza; //Se asigna raza como un enum definido por raza

    // Constructor
    public gatoSinPelo(String nombre, int edad, String color, float altura_salto, float longitud_salto, tipoPelaje tipoPelaje, raza_SinPelo raza) {
        super(nombre, edad, color, altura_salto, longitud_salto, tipoPelaje);
        this.raza = raza;
    }

    // Método para mostrar información de la mascota
    @Override
    public void imprimir() {
        super.imprimir(); // Llama al método imprimir de la clase padre
        System.out.println("Raza: " + raza);
    }
    
}
