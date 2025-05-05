package Actividad_2_Grupal.Ejercicio_4;

public class TrianguloRectangulo{
	

    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public void determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        
        if (base == altura && base == hipotenusa) {
            System.out.println("Es un triángulo equilátero");
            
        } else if (base != altura && base != hipotenusa && altura != hipotenusa) {
            System.out.println("Es un triángulo escaleno"); 
        } 
        
        else {
            System.out.println("Es un triángulo isósceles"); 
        }
    }

}
