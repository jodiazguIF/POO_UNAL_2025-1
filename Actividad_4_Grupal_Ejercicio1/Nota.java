package Actividad_4_Grupal_Ejercicio1;

public class Nota {

    private double valor;

    public Nota(double valor) {
        this.valor = valor;
    }

    public static double calcular_promedio(Nota [] notas) {

        double suma = 0;


        for (Nota nota : notas) {
            suma += nota.getValor();
        }

        return (suma / notas.length);
    }


    public static double calcularDesviación(Nota [] notas) {

        double promedio = Nota.calcular_promedio(notas);
        double suma = 0;

        for (Nota nota : notas) {
            suma += Math.pow(nota.getValor() - promedio, 2);
        }
        return Math.sqrt(suma/notas.length );

    }



    public static double obtener_menor_nota(Nota [] notas) {

        double resultado = notas[0].getValor();

        for (Nota nota : notas) {
            if (nota.getValor() < resultado) {
                resultado = nota.getValor();
            }
        }
        return resultado;

    }



    public static double obtener_mayor_nota(Nota [] notas) {

        double resultado = notas[0].getValor();

        for (Nota nota : notas) {
            if (nota.getValor() > resultado) {
                resultado = nota.getValor();
            }
        }
        return resultado;

    }


    public double getValor() {
        return valor;
    }



    public void setValor(double valor) {
        this.valor = valor;
    }

}
