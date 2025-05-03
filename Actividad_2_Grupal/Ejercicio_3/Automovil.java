package com.mycompany.ejercicio_3;

public class Automovil {
    String Marca;
    int Modelo;
    String Motor;
    int NumeroDePuertas;
    int CantidadDeAsientos;
    int VelocidadMaxima;
    int VelocidadActual;
    enum TipoCo{GASOLINA, BIOETANOL, DIESEL, BIODISESEL, 
        GAS_NATURAL};
    TipoCo TipoCombustible;
    enum TipoC {BLANCO, NEGRO, ROJO, NARANJA, 
        AMARILLO, VERDE, AZUL, VIOLETA};
    TipoC Color;
    enum TipoA{CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, 
        EJECUTIVO, SUV};
    TipoA TipoAutomovil;

    public Automovil(String Marca, int Modelo, String Motor, int NumeroDePuertas, int CantidadDeAsientos, int VelocidadMaxima, int VelocidadActual, TipoCo TipoCombustible, TipoC Color, TipoA TipoAutomovil) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.NumeroDePuertas = NumeroDePuertas;
        this.CantidadDeAsientos = CantidadDeAsientos;
        this.VelocidadMaxima = VelocidadMaxima;
        this.VelocidadActual = VelocidadActual;
        this.TipoCombustible = TipoCombustible;
        this.Color = Color;
        this.TipoAutomovil = TipoAutomovil;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public void setNumeroDePuertas(int NumeroDePuertas) {
        this.NumeroDePuertas = NumeroDePuertas;
    }

    public void setCantidadDeAsientos(int CantidadDeAsientos) {
        this.CantidadDeAsientos = CantidadDeAsientos;
    }

    public void setVelocidadMaxima(int VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }

    public void setTipoGasolina(TipoCo TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public void setColor(TipoC Color) {
        this.Color = Color;
    }

    public void setTipoAutomovil(TipoA TipoAutomovil) {
        this.TipoAutomovil = TipoAutomovil;
    }
    
    void Acelerar(int IncrementoVelocidad){
    if ((IncrementoVelocidad+VelocidadActual)<VelocidadMaxima){
        VelocidadActual=VelocidadActual+IncrementoVelocidad;
        }
    else{
        System.out.println("Error la velocidad añadidad supera a la velocidad maxima");}}
    void Desacelerar(int DecrementoVelocidad){
    if ((VelocidadActual-DecrementoVelocidad)>=0){
        VelocidadActual=VelocidadActual-DecrementoVelocidad;}}
    
    void Frenar(){
    VelocidadActual=0;}
    
    double CalculatTiempoLlegada(double distancia){
    return distancia/VelocidadActual;}
    void imprimir() {
    System.out.println("Marca = " + Marca);
    System.out.println("Modelo = " + Modelo);
    System.out.println("Motor = " + Motor);
    System.out.println("Tipo de combustible = " + TipoCombustible);
    System.out.println("Tipo de automóvil = " + TipoAutomovil);
    System.out.println("Número de puertas = " + NumeroDePuertas);
    System.out.println("Cantidad de asientos = " + CantidadDeAsientos);
    System.out.println("Velocida máxima = " + VelocidadMaxima);
    System.out.println("Color = " + Color);}
}
