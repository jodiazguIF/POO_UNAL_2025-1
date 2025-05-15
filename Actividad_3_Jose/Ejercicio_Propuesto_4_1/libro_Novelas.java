package Ejercicio_Propuesto_4_1;

public class libro_Novelas extends libro{
    enum Genero{HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIA_FICCION, AVENTURAS}
    Genero Genero_Novela;

    //Nuevo constructor
    public libro_Novelas(String titulo, String autor, int precio, Genero genero_Novela) {
        super(titulo, autor, precio);
        this.Genero_Novela = genero_Novela;
    }

    //Método para mostrar la información del libro
    public void imprimir(){
        super.imprimir();
        System.out.println("Genero Novela: " + Genero_Novela);
    }

    //Métodos set y get para los atributos del libro Novelas
    public void setGenero_Novela(Genero genero_Novela) {
        this.Genero_Novela = genero_Novela;
    }
    public Genero getGenero_Novela() {
        return Genero_Novela;
    }
}   
