package Ejercicio_4_1;

import java.util.Scanner;

public class CuentaPrueba {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in); //Se abre el scanner
    System.out.println("Cuenta de ahorros");
    System.out.print("Ingrese saldo inicial= $");
    float saldoInicialAhorros = input.nextFloat();
    System.out.print("Ingrese tasa de interés= ");
    float tasaAhorros = input.nextFloat();
    CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
    System.out.print("Ingresar cantidad a consignar: $");
    float cantidadDepositar = input.nextFloat();
    cuenta1.consignar(cantidadDepositar);
    System.out.print("Ingresar cantidad a retirar: $");
    float cantidadRetirar = input.nextFloat();
    input.close();
    cuenta1.retirar(cantidadRetirar);
    cuenta1.extractoMensual();
    cuenta1.imprimir();
    }
}
