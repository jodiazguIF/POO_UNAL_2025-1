package Ejercicio_Propuesto_4_3;

public class Profesor extends Persona{
    String departamente;
    String categoria;
    //constructor
    public Profesor(String nombre, String direccion, String departamente, String categoria) {
        super(nombre, direccion);
        this.departamente = departamente;
        this.categoria = categoria;
        System.out.println("departamento: " + departamente);
        System.out.println("categoria: " + categoria);
    }
    //método get
    public String getDepartamente() {
        return departamente;
    }
    public String getCategoria() {
        return categoria;
    }
    //método set
    public void setDepartamente(String departamente) {
        this.departamente = departamente;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
