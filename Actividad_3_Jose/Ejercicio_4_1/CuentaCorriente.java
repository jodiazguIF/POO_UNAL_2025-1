package Ejercicio_4_1;

public class CuentaCorriente extends CuentaBancaria{
    float sobregiro;

    public CuentaCorriente(float saldo, float tasa){
        super(saldo,tasa);
        sobregiro = 0; //Incialmente no hay sobregiro
    }

    public void retirar(float cantidad){
        float resultado = saldo - cantidad;
        if(resultado < 0){
            sobregiro = -resultado; // Se calcula el sobregiro
            saldo = 0; // El saldo se pone a cero
        }else{
            super.retirar(cantidad); //Si no hay sobregiro, se llama al método retirar de la clase padre
        }
    }

    public void consignar(float cantidad){
        float residuo = sobregiro - cantidad;

        if(sobregiro <= 0){
            super.consignar(cantidad); // Si no hay sobregiro, se llama al método consignar de la clase padre
            return; //Early exit
        }
        if (residuo < 0){
            sobregiro = 0; // Se calcula el nuevo sobregiro
            saldo = -residuo; // El saldo se pone a cero
        }else{
            sobregiro = residuo; // Se calcula el nuevo sobregiro
            saldo = 0; // Se actualiza el saldo
        }
    }

    public void extractoMensual(){
        super.extractoMensual(); // Se llama al método extractoMensual de la clase padre
    }

    public void imprimir(){
        System.out.println("Saldo: $" + saldo);
        System.out.println("Cargo mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " +(numeroConsignaciones+numeroRetiros) );
        System.out.println("Valor sobregiro: $" + sobregiro);
        System.out.println();
    }
}
