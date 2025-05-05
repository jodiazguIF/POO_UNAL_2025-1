package Actividad_2_Grupal.Ejercicio_3;


import Actividad_2_Grupal.Ejercicio_3.Automovil.TipoA;
import Actividad_2_Grupal.Ejercicio_3.Automovil.TipoC;
import Actividad_2_Grupal.Ejercicio_3.Automovil.TipoCo;


public class Ejercicio_3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Automovil auto1 = new Automovil("Ford",2020,3,4,8,200,160,TipoCo.GASOLINA,TipoC.NEGRO,TipoA.CIUDAD);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.VelocidadActual);
        auto1.Acelerar(20);
        System.out.println("Velocidad actual = " + auto1.VelocidadActual);
        auto1.Desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.VelocidadActual);
        auto1.Frenar();
        System.out.println("Velocidad actual = " + auto1.VelocidadActual);
        auto1.Desacelerar(20);
    }}

