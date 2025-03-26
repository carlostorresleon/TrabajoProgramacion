/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectojava;

import java.util.ArrayList;

/**
 *
 * @author yaliora113
 */
public abstract class Cuenta {
    
    //Declaracion de atributos de la clase Cuenta
    private String nombreCuenta;
    private float balance;
    private float interes;
    private boolean objetivoPrestamo;
    
    private ArrayList<Prestamo> prestamos;
    
    //Constructor de la clase Cuenta
    public Cuenta(String nombreCuenta, float balance, float interes, ArrayList<Prestamo> prestamos) {
        this.nombreCuenta = nombreCuenta;
        this.balance = balance;
        this.interes = interes;
        this.objetivoPrestamo = false;
        this.prestamos = prestamos;
    }
    
    public Cuenta(){
        
        this.objetivoPrestamo = false;
    }
    
    //Metodos get y set de la clase Cuenta
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public boolean isObjetivoPrestamo() {
        return objetivoPrestamo;
    }

    public void setObjetivoPrestamo(boolean objetivoPrestamo) {
        this.objetivoPrestamo = objetivoPrestamo;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    //Metodo para depositar una cantidad al balance de una cuenta
    public void depositar(float cantidad){
        
        this.balance += cantidad;
    }
    
    //Metodo para retirar una cantidad al balance de una cuenta
    public void retirar(float cantidad){
        
        this.balance += cantidad;
    }
    
    //Metodo que aplica una tasa de interes al balance de una cuenta
    public void aplicarTasaIntereses(){
        
        this.balance *= interes;
    }
    
    //Metodo que impide el pedir otro prestamo si ya tienes uno pendiente de devolver
    public void pedirPrestamo(){
        
        if (!objetivoPrestamo) {
            
            this.objetivoPrestamo = true;
        }
        
        else{
            
            System.out.println("Ya tiene un prestamo pendiente, no puede pedir otro prestamo.");
        }
    }
    
    @Override
    public String toString() {
        
        return (
                "Nombre de la cuenta: " + getNombreCuenta() + "\n"
                + "Balance: " + getBalance() + "\n"
                + "Interes: " + getInteres() + "\n"
                + "Prestamo pendiente: " + isObjetivoPrestamo() + "\n"
                + "Lista de prestamos: " + getPrestamos()
        );
    }
}
