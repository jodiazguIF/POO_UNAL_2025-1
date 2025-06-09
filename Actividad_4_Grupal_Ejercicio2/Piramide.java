package Actividad_4_Grupal_Ejercicio2;

public final class Piramide extends Figuras {
    private final double base; //Atributo que identifica la base de la pirámide
    private final double altura; //Atributo que identifica la altura de la pirámide
    private final double apotema; //Atributo que identifica la apotema de la pirámide

    // Método para calcular el volumen de la pirámide
    public double calcularVolumen() {
        return (1.0 / 3.0) * Math.pow(base, 2) * altura;
    }

    // Método para calcular la superficie de la pirámide
    public double calcularSuperficie() {
        double areaBase = Math.pow(base, 2); // Área de la base
        double areaLateral = 2 * base * apotema; // Área lateral
        return areaBase + areaLateral; // Superficie total
    }

    // Constructor que inicializa la base y la altura de la pirámide
    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
}
