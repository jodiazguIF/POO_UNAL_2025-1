package Actividad_2_Grupal.Ejercicio_4;



public class PruebaFiguras {
	
	public static void main(String[] args) {
		Circulo figura1 = new Circulo(2);
		Rectangulo figura2 = new Rectangulo(1,2);
		Cuadrado figura3 = new Cuadrado(3);
		TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
		System.out.println("El área del círculo es = " + figura1.calcularArea());
		System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
		
		System.out.println();
		
		System.out.println("El área del rectángulo es = " + figura2.calcularArea());
		System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
		System.out.println();
		System.out.println("El área del cuadrado es = " + figura3.
		calcularArea());
		System.out.println("El perímetro del cuadrado es = " + figura3.
		calcularPerimetro());
		System.out.println();
		System.out.println("El área del triángulo es = " + figura4.
		calcularArea());
		System.out.println("El perímetro del triángulo es = " + figura4.
		calcularPerimetro());
		figura4.determinarTipoTriangulo();
		
		
		System.out.println();
		
        Rombo rombo = new Rombo(69, 4, 6);
        System.out.println("Área del rombo: " + rombo.calcularArea());
        System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());

        System.out.println(); 

   
        Trapecio trapecio = new Trapecio(15, 8, 5, 5, 6);
        System.out.println("Área del trapecio: " + trapecio.calcularArea());
        System.out.println("Perímetro del trapecio: " + trapecio.calcularPerimetro());

	}

}
