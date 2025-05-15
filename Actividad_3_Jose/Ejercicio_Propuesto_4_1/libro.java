package Ejercicio_Propuesto_4_1;

public class libro {
    private String titulo;
    private String autor;
    public float precio;
    
    //Constructor de la clase Libro
    public libro(String titulo, String autor, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    //Método para mostrar la información del libro
    void imprimir(){ 
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
    }

    //Métodos set para los atributos del libro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Métodos get para los atributos del libro
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public float getPrecio() {
        return precio;
    }
}