package Ejercicio_4_2.Inmuebles;

public class InmuebleVivienda extends Inmueble{
    protected int inmuebleVivienda_numeroHabitaciones;
    protected int inmuebleVivienda_numeroBanos;

    // Constructor
    public InmuebleVivienda(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, int inmuebleVivienda_numeroHabitaciones, int inmuebleVivienda_numeroBanos) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion);
        this.inmuebleVivienda_numeroHabitaciones = inmuebleVivienda_numeroHabitaciones;
        this.inmuebleVivienda_numeroBanos = inmuebleVivienda_numeroBanos;
    }

    //Mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones: " + inmuebleVivienda_numeroHabitaciones);
        System.out.println("Número de banos: " + inmuebleVivienda_numeroBanos);
    }
}
