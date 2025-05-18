package Ejercicio_4_2.Inmuebles;

/*
 * Esta clase denominada inmueble modela un imueble que posee
 * como atributos un identificaor, un área, una dirección y un precio
 * de venta. Es la clase raíz de una jerarquía de herencia.
 */

public class Inmueble {
    protected int inmueble_identificadorInmobiliario;
    protected int inmueble_Area;
    protected String inmueble_Direccion; 
    protected double inmueble_PrecioVenta;

    // Constructor
    public Inmueble(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion) {
        this.inmueble_identificadorInmobiliario = inmueble_identificadorInmobiliario;
        this.inmueble_Area = inmueble_Area;
        this.inmueble_Direccion = inmueble_Direccion;
    }

    //Método para calcular el valor del inmueble
    public double calcularValorInmueble(double valorArea) {
        inmueble_PrecioVenta = inmueble_Area * valorArea;
        return inmueble_PrecioVenta;
    }

    //Método para imprimir
    void imprimir(){
        System.out.println("Identificador inmobiliario: " + inmueble_identificadorInmobiliario);
        System.out.println("Área: " + inmueble_Area);
        System.out.println("Dirección: " + inmueble_Direccion);
        System.out.println("Precio de venta: $" + inmueble_PrecioVenta);
    }
}
