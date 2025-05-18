package Ejercicio_Propuesto_4_2.TiendaMascotas;

import Ejercicio_Propuesto_4_2.TiendaMascotas.gato.tipoPelaje;
import Ejercicio_Propuesto_4_2.TiendaMascotas.gatoPeloCorto.raza_PeloCorto;
import Ejercicio_Propuesto_4_2.TiendaMascotas.gatoPeloLargo.raza_PeloLargo;
import Ejercicio_Propuesto_4_2.TiendaMascotas.perroGrande.raza_Grande;
import Ejercicio_Propuesto_4_2.TiendaMascotas.perro.tamano;

public class prueba {
    public static void main(String[] args) {
        // Crear un gato de pelo corto
        gatoPeloCorto gato1 = new gatoPeloCorto("Miau", 3, "Gris", 2.0f, 
        1.5f, tipoPelaje.PELO_CORTO, raza_PeloCorto.BRITANICO);
        // Crear un gato de pelo largo
        gatoPeloLargo gato2 = new gatoPeloLargo("Ronroneo", 4, "Blanco", 2.5f
        , 1.8f, tipoPelaje.PELO_LARGO, raza_PeloLargo.HIMALAYO);
        perroGrande perro1 = new perroGrande("Ladrido", 5, "Marrón", 10.0f, true, tamano.GRANDE, raza_Grande.PASTOR_ALEMAN);

        // Imprimir información de los gatos
        System.out.println("Información del Gato de Pelo Corto:");
        gato1.imprimir();
        
        System.out.println("\nInformación del Gato de Pelo Largo:");
        gato2.imprimir();

        System.out.println("\nInformación del Perro Grande:");
        perro1.imprimir();
    }
}
