package Ejercicio_4_2.Inmuebles;

public class apartamento_familiar extends apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    //constructor
    public apartamento_familiar(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, int inmuebleVivienda_numeroHabitaciones, int inmuebleVivienda_numeroBanos, int valorAdministracion) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, inmuebleVivienda_numeroHabitaciones, inmuebleVivienda_numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }

    //Mostrar datos
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion: $" + valorAdministracion);
    }
}