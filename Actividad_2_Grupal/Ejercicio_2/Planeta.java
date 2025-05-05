package Actividad_2_Grupal.Ejercicio_2;

public class Planeta{
    /**
     * Esta clase define objetos de tipo Planeta con un nombre, cantidad de satélites, masa,
     * volumen, diámetro, distancia al sol, tipo de planeta y si es observable o no.
     */
    //Atributo que define el nombre de un planeta
    String nombre = null;
    //Atributo que define la cantidad de satelites que tiene un planeta
    int cantidadSatelites = 0;
    // Atributo que define la masa de un planeta
    double masa = 0;
    // Atributo que define el volumen de un planeta
    double volumen = 0;
    // Atributo que define el diámetro de un planeta
    int diámetro = 0;
    // Atributo que define la distancia al sol de un planeta
    int distanciaSol = 0;
    // Atributo que define el tipo de planeta como un valor enumerado
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    // Atributo que define el tipo de planeta
    tipoPlaneta tipo;
    // Atributo que define si el planeta es observable o no
    boolean esObservable = false;

    Planeta(String nombre, int cantidadSatelites, double masa, double
    volumen, int diámetro, int distanciaSol, tipoPlaneta tipo, boolean
    esObservable) {
    this.nombre = nombre;
    this.cantidadSatelites = cantidadSatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diámetro = diámetro;
    this.distanciaSol = distanciaSol;
    this.tipo = tipo;
    this.esObservable = esObservable;
    }
}
