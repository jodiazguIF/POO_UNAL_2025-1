package Actividad_4_Grupal_Ejercicio2;

public class Figuras {
    private double volumen; //Atributo que identifica el volumen de la figura geométrica
    private double superficie; //Atributo que identifica la superficie de la figura geométrica
    
    // Método para establecer el volumen de una figura geométrica 
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    // Método para establecer la superficie de una figura geométrica
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    //Método para obtener el volumen de una figura geométrica
    public double getVolumen() {
        return this.volumen;
    }

    //Método para obtener la superfiie de ina figura geométrica
    public double getSuperficie() {
        return this.superficie;
    }
}
