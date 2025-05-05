package Actividad_2_Grupal.Ejercicio_5;

public class cuenta_Bancaria {
    String nombre_Titular = null; //Atributo que define el nombre del titular de la cuenta
    String apellidos_Titular = null; //Atributo que define los apellidos del titular de la cuenta
    String numero_Cuenta = null; //Atributo que define el número de cuenta
    enum tipo_Cuenta {AHORRO, CORRIENTE} //Atributo que define el tipo de cuenta como un valor enumerado
    tipo_Cuenta tipo_dCuenta; //Atributo que define el tipo de cuenta
    float saldo_Cuenta = 0; //Atributo que define el saldo de la cuenta bancaria
    float porcentaje_Interes = 0.13f; //Atributo que define el porcentaje de interés de la cuenta bancaria

    /*Constructor */
    public cuenta_Bancaria(String nombre_Titular, String apellidos_Titular, String numero_Cuenta,
                tipo_Cuenta tipo_dCuenta) {
            this.nombre_Titular = nombre_Titular;
            this.apellidos_Titular = apellidos_Titular;
            this.numero_Cuenta = numero_Cuenta;
            this.tipo_dCuenta = tipo_dCuenta;
    }
    public void imprimir() {
        System.out.println("Nombres del titular = " + nombre_Titular);
        System.out.println("Apellidos del titular = " + apellidos_Titular);
        System.out.println("Número de cuenta = " + numero_Cuenta);
        System.out.println("Tipo de cuenta = " + tipo_dCuenta);
        System.out.println("Saldo = " + saldo_Cuenta);
        System.out.println("Porcentaje de interés mensual= " + porcentaje_Interes*100 + "%");
        }

    public void consultar_Saldo() {
        System.out.println("El saldo actual es: " + saldo_Cuenta);
    }

    public boolean consignar(float cantidad){
        if (cantidad > 0) {
            this.saldo_Cuenta += cantidad;
            System.out.println("Se ha consignado $" + cantidad + " a la cuenta. Nuevo saldo es: $" + saldo_Cuenta);
            return true;
        } else {
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
            return false;
        }
    }
    public boolean retirar(float cantidad){
        if (cantidad > 0 && cantidad <= this.saldo_Cuenta) {
            this.saldo_Cuenta -= cantidad;
            System.out.println("Se ha retirado $" + cantidad + " de la cuenta. Nuevo saldo: $" + saldo_Cuenta);
            return true;
        } else{
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
            return false;
        }
    }
    public void saldo_TrasInteres(){
        float interes = this.saldo_Cuenta * this.porcentaje_Interes;
        this.saldo_Cuenta += interes;
        System.out.println("El saldo tras aplicar el interés es: $" + saldo_Cuenta);
    }
    public static void main(String args[]) {
        cuenta_Bancaria cuenta = new cuenta_Bancaria("Pedro","Pérez", "123456789", tipo_Cuenta.AHORRO);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.saldo_TrasInteres();
        }
}
