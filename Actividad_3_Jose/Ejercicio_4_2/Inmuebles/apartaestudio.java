package Ejercicio_4_2.Inmuebles;

public class apartaestudio extends apartamento{
    protected static double valorArea = 1500000;

    //constructor
    public apartaestudio(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, int inmuebleVivienda_numeroHabitaciones, int inmuebleVivienda_numeroBanos){
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, inmuebleVivienda_numeroHabitaciones, inmuebleVivienda_numeroBanos);
    }

    //Mostrar datos
    @Override
    void imprimir() {
        super.imprimir();
    }   
}
