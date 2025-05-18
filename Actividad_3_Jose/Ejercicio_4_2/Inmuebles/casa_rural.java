package Ejercicio_4_2.Inmuebles;

public class casa_rural extends casa{
    protected static double valorArea = 1500000;
    protected int casa_rural_distanciaCabecera;
    protected int casa_rural_altitud;

    //Constructor
    public casa_rural(int casa_rural_identificadorInmobiliario,int casa_rural_area,
    String casa_rural_direccion, int casa_rural_numeroHabitaciones, int casa_rural_numeroBanos, int casa_rural_numeroPisos, int casa_rural_distanciaCabecera, int casa_rural_altitud) {
        super(casa_rural_identificadorInmobiliario, casa_rural_area, casa_rural_direccion, casa_rural_numeroHabitaciones, casa_rural_numeroBanos, casa_rural_numeroPisos);
        this.casa_rural_distanciaCabecera = casa_rural_distanciaCabecera;
        this.casa_rural_altitud = casa_rural_altitud;
    }

    //mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + casa_rural_distanciaCabecera + " km");
        System.out.println("Altitud: " + casa_rural_altitud);
    }
}


