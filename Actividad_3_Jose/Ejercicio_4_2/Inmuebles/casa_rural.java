package Ejercicio_4_2.Inmuebles;

public class casa_rural extends casa{
    protected static double valorArea = 1500000;
    protected int distanciaCabecera;
    protected int altitud;

    //Constructor
    public casa_rural(int casa_rural_identificadorInmobiliario,int casa_rural_area,
    String casa_rural_direccion, int casa_rural_numeroHabitaciones, int casa_rural_numeroBanos, int casa_rural_numeroPisos, int distanciaCabecera, int altitud) {
        super(casa_rural_identificadorInmobiliario, casa_rural_area, casa_rural_direccion, casa_rural_numeroHabitaciones, casa_rural_numeroBanos, casa_rural_numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    //mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabecera + " km");
        System.out.println("Altitud: " + altitud);
    }
}


