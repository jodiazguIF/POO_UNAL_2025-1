package Ejercicio_4_1;

public class CuentaAhorros extends CuentaBancaria{
    private boolean activa;
    public CuentaAhorros(float saldo, float tasa){
        super(saldo, tasa); //Se usa super para invocar el constructor de la clase padre
        activa = saldo >= 10000; //La cuenta no está activa si el saldo es menor a 10,000
        //La cuenta está activa si el saldo es mayor o igual a 10,000
    }

    @Override
    public void retirar(float cantidad){
        if(activa){
            super.retirar(cantidad);    // Se llama al método retirar de la clase padre
        }else{
            System.out.println("La cuenta no está activa. No se puede retirar.");
        }
    }

    @Override
    public void extractoMensual(){
        if (numeroRetiros>4){
            comisionMensual += (numeroRetiros-4) * 1000;
        }
        super.extractoMensual(); // Se llama al método extractoMensual de la clase padre
        if (saldo < 10000){
            activa = false; // La cuenta no está activa si el saldo es menor a 10,000
        }
    }

    public void imprimir(){
        System.out.println("Saldo: $" + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " +(numeroConsignaciones+numeroRetiros) );
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
}

