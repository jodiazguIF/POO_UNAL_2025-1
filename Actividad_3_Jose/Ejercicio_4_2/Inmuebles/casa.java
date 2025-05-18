package Ejercicio_4_2.Inmuebles;

public class casa extends InmuebleVivienda{
    protected int casa_numeroPisos;

    //constructor
    public casa(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, int inmuebleVivienda_numeroHabitaciones, int inmuebleVivienda_numeroBanos, int casa_numeroPisos) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, inmuebleVivienda_numeroHabitaciones, inmuebleVivienda_numeroBanos);
        this.casa_numeroPisos = casa_numeroPisos;
    }
    //Mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Número de pisos: " + casa_numeroPisos);
    }
}
