package Ejercicio_4_2.Inmuebles;

public class oficina extends local{
    protected static double valorArea = 3500000;
    protected boolean esGobierno;

    //constructor
    public oficina(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, tipoLocal tipo_Local, boolean esGobierno) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion, tipo_Local);
        this.esGobierno = esGobierno;
    }

    //mostrar datos
    void imprimir(){
        super.imprimir();
        System.out.println("Es Gobierno: " + esGobierno);
    }
}
