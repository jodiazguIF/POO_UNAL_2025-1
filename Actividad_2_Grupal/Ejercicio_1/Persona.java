package Actividad_2_Grupal.Ejercicio_1;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final String documentoIdentidad;
    private final int yearNacimiento;
    private final String paisNacimiento; 
    private final char genero;            

   
    public Persona(String nombre, String apellidos, String identidad, int yearNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.documentoIdentidad = identidad;
        this.yearNacimiento = yearNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellido);
        System.out.println("Numero de documento de identidad = " + documentoIdentidad);
        System.out.println("Año de nacimiento = " + yearNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        
        if (genero == 'H') {
        	
        	System.out.println("Género = " + " Hombre");
        	
        }
        
        else {
        	System.out.println("Género = " + " Mujer");
        }
        
        System.out.println();
        
  
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Maria Fernanda", "Cabal", "69696969", 1900, "Colombia", 'M');
        Persona persona2 = new Persona("Alvarito", "Uribe Veléz", "1010122323", 1870, "Colombia", 'H');
        
        persona1.imprimir();
        persona2.imprimir();
    }
}
