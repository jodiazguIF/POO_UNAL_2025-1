package Ejercicio_Propuesto_4_3;

public class Estudiante extends Persona {
    String carrera;
    int semestre;

    Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
        System.out.println("carrera: " + carrera);
        System.out.println("semestre: " + semestre);
    }
    //método get
    public String getCarrera() {
        return carrera;
    }
    public int getSemestre() {
        return semestre;
    }
    //método set
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
