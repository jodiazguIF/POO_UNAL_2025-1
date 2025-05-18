package Ejercicio_Propuesto_4_3;

public class Persona {
    String nombre;
    String direccion;

    //constructor
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        System.out.println("nombre: " + nombre);
        System.out.println("direccion: " + direccion);
    }

    //método get
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    //método set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
