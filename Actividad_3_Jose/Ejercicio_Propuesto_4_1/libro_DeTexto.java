package Ejercicio_Propuesto_4_1;

public class libro_DeTexto extends libro{
    String curso_Asociado;

    //Constructor de la clase Libro de Texto
    public libro_DeTexto(String titulo, String autor, float precio, String curso_Asociado) {
        super(titulo, autor, precio);
        this.curso_Asociado = curso_Asociado;
    }

    public void imprimir(){ 
        super.imprimir();
        System.out.println("Curso Asociado: " + curso_Asociado);
    }

    //Métodos set y get para los atributos del libro de texto
    public void setCurso_Asociado(String curso_Asociado) {
        this.curso_Asociado = curso_Asociado;
    }
    public String getCurso_Asociado() {
        return curso_Asociado;
    }
}