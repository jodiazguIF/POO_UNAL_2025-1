package Ejercicio_Propuesto_4_2.TiendaMascotas;

public class gato extends Mascota {
    protected enum tipoPelaje{ //Vsibles para el paquete y todas las subclases
        SIN_PELO,
        PELO_LARGO,
        PELO_CORTO,
    }
    protected tipoPelaje tipoPelaje; //Se asigna tipoPelaje como un enum definido por tipoPelaje
    protected float altura_salto;
    protected float longitud_salto;

    //constructor
    public gato(String nombre, int edad, String color, float altura_salto, float longitud_salto, tipoPelaje tipoPelaje) {
        super(nombre, edad, color);
        this.altura_salto = altura_salto;
        this.longitud_salto = longitud_salto;
        this.tipoPelaje = tipoPelaje;
    }
    //método estático sonido
    public static void sonido() {
        System.out.println("Los gatos maullan y ronronean");
    }
    //método para mostrar información de la mascota
    public void imprimir() {
        super.imprimir(); //llama al método imprimir de la clase padre
        System.out.println("Altura de salto: " + altura_salto + " m");
        System.out.println("Longitud de salto: " + longitud_salto + " m");
        System.out.println("Tipo de pelaje: " + tipoPelaje);
    }
}
