package Ejercicio_4_2.Inmuebles;

public class prueba {
    public static void main(String args[]) {
        apartamento_familiar apto1 = new apartamento_familiar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularValorInmueble(apartamento_familiar.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        apartaestudio aptestudio1 = new
        apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
        aptestudio1.calcularValorInmueble(apartaestudio.valorArea);
        aptestudio1.imprimir();
    }        
}
