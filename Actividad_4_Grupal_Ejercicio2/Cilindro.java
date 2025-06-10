package com.mycompany.figuras;

public final class Cilindro extends Figuras {
    private final double radio; //Atributo que identifica el radio del cilindro
    private final double altura; //Atributo que identifica la altura del cilindro
    
    // Método para calcular el volumen del cilindro
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    // Método para calcular la superficie del cilindro
    public double calcularSuperficie() {
        double areaLadoA = 2 * Math.PI * radio * altura; // Área lateral
        double areaBase = Math.PI * Math.pow(radio, 2); // Área de la base
        return areaBase + areaLadoA; // Superficie total
    }

    // Constructor que inicializa el radio y la altura del cilindro
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

}
