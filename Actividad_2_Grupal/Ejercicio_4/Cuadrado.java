package Actividad_2_Grupal.Ejercicio_4;

public class Cuadrado {
    
    //En centimetros
    private int longitud;
    
    public Cuadrado(int lado) {
    	this.longitud = lado;
    }
    
    
    public double calcularArea(){
        return Math.pow(longitud, 2);
    }
    
    public double calcularPerimetro(){
        return 4*longitud;
    }
    
    
}
