package Ejercicio_4_1;

public class CuentaBancaria{
    protected float saldo;
    protected int numeroConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public CuentaBancaria(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            numeroConsignaciones++;
        }else{
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(float cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;
            numeroRetiros++;
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calcularInteresMensual(){
        float interesMensual = (saldo * tasaAnual) / 12;
        saldo += interesMensual;
    }

    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteresMensual();
    }
}