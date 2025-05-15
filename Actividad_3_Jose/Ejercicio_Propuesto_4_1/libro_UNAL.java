package Ejercicio_Propuesto_4_1;

public class libro_UNAL extends libro_DeTexto{
    String Facultad_Autora;

    //Nuevo constructor
    public libro_UNAL(String nombre, String autor, int precio, String curso_Asociado, String facultad_Autora) {
        super(nombre, autor, precio, curso_Asociado);
        this.Facultad_Autora = facultad_Autora;
    }

    //Método para mostrar la información del libro
    public void imprimir(){
        super.imprimir();
        System.out.println("Facultad Autora: " + Facultad_Autora);
    }

    //Métodos set y get para los atributos del libro UNAL
    public void setFacultad_Autora(String facultad_Autora) {
        this.Facultad_Autora = facultad_Autora;
    }
    public String getFacultad_Autora() {
        return Facultad_Autora;
    }
}
