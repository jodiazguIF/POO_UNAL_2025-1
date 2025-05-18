package Ejercicio_4_2.Inmuebles;

public class casa_urbana extends casa{
    //Constructor
    public casa_urbana(int casa_urbana_identificadorInmobiliario,int casa_urbana_area, String casa_urbana_direccion, int casa_urbana_numeroHabitaciones, int casa_urbana_numeroBaños, int casa_urbana_numeroPisos) {
        super(casa_urbana_identificadorInmobiliario, casa_urbana_area, casa_urbana_direccion, casa_urbana_numeroHabitaciones, casa_urbana_numeroBaños, casa_urbana_numeroPisos);
    }

    //mostrar datos
    void imprimir(){
        super.imprimir();
    }
}