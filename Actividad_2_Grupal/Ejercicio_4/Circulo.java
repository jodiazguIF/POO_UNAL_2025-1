package Actividad_2_Grupal.Ejercicio_4;

public class Circulo {
    
    //En centimetros
    private int radio;
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double calcularPerimetro(){
        return 2* Math.PI* radio;
    }
    
    
}

