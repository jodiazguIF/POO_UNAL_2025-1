package Ejercicio_4_2.Inmuebles;

public class apartamento extends InmuebleVivienda {
    //constructor
    public apartamento(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, int inmuebleVivienda_numeroHabitaciones, int inmuebleVivienda_numeroBanos) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, inmuebleVivienda_numeroHabitaciones, inmuebleVivienda_numeroBanos);
    }
    //Mostrar datos
    void imprimir() {
        super.imprimir();
    }
}
