package Ejercicio_4;
import java.util.*;
import java.util.regex.Pattern;
public class EquipoMaratonProgramacion {
    private String nombreEquipo;
    private String universidad;
    private String lenguajeProgramacion;
    private Programador[] programadores;
    private int tamanoEquipo;
    private int contador;

    public EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramacion, int tamanoEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.tamanoEquipo = tamanoEquipo;
        this.programadores = new Programador[tamanoEquipo];
        this.contador = 0;
    }

    public boolean estaCompleto() {
        return contador >= tamanoEquipo;
    }

    public void anadirProgramador(Programador p) {
        if (estaCompleto()) {
            throw new IllegalStateException("El equipo ya está completo");
        }
        validarCampo(p.getNombre());
        validarCampo(p.getApellidos());
        programadores[contador++] = p;
    }

    private void validarCampo(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("El campo no puede estar vacío");
        }
        if (texto.length() >= 20) {
            throw new IllegalArgumentException("El campo no puede tener 20 o más caracteres");
        }
        if (!Pattern.matches("[A-Za-zÁÉÍÓÚáéíóúÑñ ]+", texto)) {
            throw new IllegalArgumentException("El campo solo puede contener letras y espacios");
        }
    }

    public Programador[] getProgramadores() {
        Programador[] copia = new Programador[contador];
        System.arraycopy(programadores, 0, copia, 0, contador);
        return copia;
    }

    public int getTamanoEquipo() {
        return tamanoEquipo;
    }

    public int getContador() {
        return contador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }
}

