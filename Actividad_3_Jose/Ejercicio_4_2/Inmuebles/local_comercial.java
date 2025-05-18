package Ejercicio_4_2.Inmuebles;

public class local_comercial extends local{
    protected static double valorArea = 3000000;
    protected String centroComercial;

    //constructor
    public local_comercial(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, tipoLocal tipo_Local, String centroComercial) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, tipo_Local);
        this.centroComercial = centroComercial;
    }

    //mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
    }
}
