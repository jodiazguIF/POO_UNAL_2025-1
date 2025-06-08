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
    double diámetro = 0;
    // Atributo que define la distancia al sol de un planeta
    int distanciaSol = 0;
    // Atributo que define el tipo de planeta como un valor enumerado
    public enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    // Atributo que define el tipo de planeta
    tipoPlaneta tipo;
    // Atributo que define si el planeta es observable o no
    boolean esObservable = false;
    float periodo_Orbital; //En años
    float periodo_Rotacion; //En horas

    /*Constructor */
    public Planeta(String nombre, int cantidadSatelites, double masa, double
    volumen, double diámetro, int distanciaSol, tipoPlaneta tipo, boolean esObservable,
    float periodo_Orbital, float periodo_Rotacion) {
    this.nombre = nombre; //this. hace referencia a la variable de la clase y no a la variable del constructor
    this.cantidadSatelites = cantidadSatelites;
    this.masa = masa;
    this.volumen = volumen;
    this.diámetro = diámetro;
    this.distanciaSol = distanciaSol;
    this.tipo = tipo;
    this.esObservable = esObservable;
    this.periodo_Orbital = periodo_Orbital;
    this.periodo_Rotacion = periodo_Rotacion;
    }

    //Método que imprime los datos de un planeta
    public void imprimir() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satelites: " + cantidadSatelites);
        System.out.println("Masa del planeta: " + masa + " kg");
        System.out.println("Volumen del planeta: " + volumen + " m³");
        System.out.println("Diámetro del planeta: " + diámetro + " km");
        System.out.println("Distancia al sol: " + distanciaSol + " km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Periodo orbital: " + periodo_Orbital + " años");
        System.out.println("Periodo de rotación: " + periodo_Rotacion + " horas");
    }

    //Método que calcula y devuelve la densidad del planeta
    double calcularDensidad() {
        return masa / volumen;
    }

    //Método que calcula y devuelve si un planeta es exterior o no
    boolean esPlanetaExterior() {
        float limite = (float) (149597870 * 3.4);
        return distanciaSol > limite;
    }
    /**
    * Método main que crea dos planetas, imprime sus datos en pantalla,
    * determina su densidad y si son planetas exteriores
    */
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.0832E12, 12742, 150000000, tipoPlaneta.TERRESTRE, true, 1f, 24f );
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad() + " kg/m³");
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
        System.out.println();
        Planeta p2 = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15,139820,750000000,tipoPlaneta.GASEOSO, true, 11.86f , 10f );
        p2.imprimir();
        System.out.println("Densidad del planeta = " + p2.calcularDensidad() + " kg/m³");
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
    }
}
