package ejercicio1;

public class Nota {

    private double valor;

    public Nota(double valor) {
        this.valor = valor;
    }

    public static double calcular_promedio(Nota [] notas) {

        double suma = 0;


        for(int i= 0; i < notas.length; i++) {
            suma += notas[i].getValor();
        }

        return (suma / notas.length);
    }


    public static double calcularDesviación(Nota [] notas) {

        double promedio = Nota.calcular_promedio(notas);
        double suma = 0;

        for(int i=0; i < notas.length; i++) {

            suma += Math.pow(notas[i].getValor() - promedio, 2 );
        }
        return Math.sqrt(suma/notas.length );

    }



    public static double obtener_menor_nota(Nota [] notas) {

        double resultado = notas[0].getValor();

        for(int i=0; i < notas.length; i++) {
            if (notas[i].getValor() < resultado) {

                resultado = notas[i].getValor();
            }
        }
        return resultado;

    }



    public static double obtener_mayor_nota(Nota [] notas) {

        double resultado = notas[0].getValor();

        for(int i=0; i < notas.length; i++) {
            if (notas[i].getValor() > resultado) {

                resultado = notas[i].getValor();
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
