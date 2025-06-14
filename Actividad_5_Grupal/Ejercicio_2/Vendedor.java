package Actividad_5_Grupal.Ejercicio_2;

public class Vendedor {
    String nombre;
    String apellido;
    int edad;

    //Constructor
    public Vendedor(String nombre, String apellido) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }else{
            this.nombre = nombre;
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo o vacío.");
        }else{
            this.apellido = apellido;
        }
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        verificarEdad(edad); // Verificar la edad antes de asignarla
    }

    //Verificación  de edad
    void verificarEdad(int edad){
        if (edad < 18 && edad >= 0) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        }if (edad >= 18 && edad <= 120) {
            this.edad = edad; // Asignar la edad solo si es válida
        }else{
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor de 120 años.");
        }
    }

}
