/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;


/*
- float monto
- float tasaInteres
- int plazoEnMeses

+ calcularCuotaMensual() : float
+ getMonto()
+ getTasaInteres()
+ getPlazo()
+ toString()

 */
public class Prestamo {
    private float monto;
    private float tasaInteres;
    private int plazoEnMeses;

    public Prestamo(float monto, float tasaInteres, int plazoEnMeses) {
        this.monto = monto;
        this.tasaInteres = tasaInteres;
        this.plazoEnMeses = plazoEnMeses;
    }

    public float getMonto() {
        return monto;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }
    
    public void calcularCuotaMensual(){
        
    }
    
    @Override
    public String toString(){
        return "bla bla bla bla ";
    }
    
}
