package Ejercicio_4_2.Inmuebles;

public class casaConjuntoCerrado extends casa_urbana{
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;

    //constructor
    public casaConjuntoCerrado(int casa_urbana_identificadorInmobiliario,int casa_urbana_area, String casa_urbana_direccion, int casa_urbana_numeroHabitaciones, int casa_urbana_numeroBaños, int casa_urbana_numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(casa_urbana_identificadorInmobiliario, casa_urbana_area, casa_urbana_direccion, casa_urbana_numeroHabitaciones, casa_urbana_numeroBaños, casa_urbana_numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;    
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    //mostrar datos
    void imprimir() {
        super.imprimir();
        System.out.println("Valor Administracion: " + valorAdministracion);
        System.out.println("¿Tiene piscina?: " + tienePiscina);
        System.out.println("¿Tiene campos deportivos?: " + tieneCamposDeportivos);
    }
}
