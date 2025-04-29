package Ejercicio4;

public class Rombo {
	
	private int diagonalMayor;
    private int diagonalMenor;
    private int lado;

    public Rombo(int diagonalMayor, int diagonalMenor, int lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public int calcularPerimetro() {
        return 4 * lado;
    }

}
