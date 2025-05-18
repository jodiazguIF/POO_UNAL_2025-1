package Ejercicio_4_2.Inmuebles;

/*
 * Esta clase denominada inmueble modela un imueble que posee
 * como atributos un identificaor, un área, una dirección y un precio
 * de venta. Es la clase raíz de una jerarquía de herencia.
 */

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion; 
    protected double precioVenta;

    // Constructor
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    //Método para calcular el valor del inmueble
    public double calcularValorInmueble(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }

    //Método para imprimir
    void imprimir(){
        System.out.println("Identificador inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área: " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio de venta: $" + precioVenta);
    }
}
