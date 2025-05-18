package Ejercicio_4_2.Inmuebles;

public class local extends Inmueble{
    enum tipoLocal{
        INTERNO,
        CALLE};
    protected tipoLocal tipo_Local; //Se le asigna el enum al tipolocal

    //constructor
    public local(int inmueble_identificadorInmobiliario, int inmueble_Area, String inmueble_Direccion, tipoLocal tipo_Local) {
        super(inmueble_identificadorInmobiliario, inmueble_Area, inmueble_Direccion);
        this.tipo_Local = tipo_Local;
    }

    //mostrar datos
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipo_Local);
    }
}
