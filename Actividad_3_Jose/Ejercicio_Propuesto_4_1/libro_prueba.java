package Ejercicio_Propuesto_4_1;

public class libro_prueba {
    public static void main(String[] args) {
        // Crear un libro de Novelas
        libro_Novelas novela = new libro_Novelas("Cien años de soledad", "Gabriel García Márquez", 2000, libro_Novelas.Genero.HISTORICA);
        libro_UNAL libro_unal = new libro_UNAL("Introducción a la Física Mecánica", "Wilmer Saldarriaga", 50000, "Fisica", "Facultad de Ciencias");

        // Imprimir la información del libro
        novela.imprimir();
        libro_unal.imprimir();
    }
}
