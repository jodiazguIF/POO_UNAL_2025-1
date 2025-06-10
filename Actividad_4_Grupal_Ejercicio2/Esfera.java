package com.mycompany.figuras;

public final class Esfera extends Figuras {
    private final double radio; //Atributo que identifica el radio de la esfera

    // Método para calcular el volumen de la esfera
    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radio, 3);
    }

    // Método para calcular la superficie de la esfera
    public double calcularSuperficie() {
        return 4 * Math.PI * Math.pow(this.radio, 2);
    }

    // Constructor que recibe el radio de la esfera
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen()); //Calcula el volumen y establece su atributo
        this.setSuperficie(calcularSuperficie());   //Calcula la superficie y establece su atributo
    }

}
