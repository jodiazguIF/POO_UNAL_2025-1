package Ejercicio4;

public class Triangulo {
    
    //En centimetros
    private int base;
    private int altura;
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return 2*base + 2*altura;
    }
    
}
