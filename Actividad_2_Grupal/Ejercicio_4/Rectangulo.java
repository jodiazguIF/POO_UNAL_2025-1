package Actividad_2_Grupal.Ejercicio_4;

public class Rectangulo {
    
    //En centimetros
    private int base;
    private int altura;
    
    public Rectangulo(int base, int altura) {
    	this.base = base;
    	this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return (2*base) + (2*altura);
    }
    
}
