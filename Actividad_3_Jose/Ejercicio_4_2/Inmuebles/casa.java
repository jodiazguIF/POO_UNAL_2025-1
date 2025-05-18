package Ejercicio_4_2.Inmuebles;

public class casa extends InmuebleVivienda{
    protected int numeroPisos;

    //constructor
    public casa(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, int inmuebleVivienda_numeroHabitaciones, int inmuebleVivienda_numeroBanos, int numeroPisos) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, inmuebleVivienda_numeroHabitaciones, inmuebleVivienda_numeroBanos);
        this.numeroPisos = numeroPisos;
    }
    //Mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Número de pisos: " + numeroPisos);
    }
}
