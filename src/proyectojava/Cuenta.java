/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class Cuenta {
    
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
    public String getNombreCuenta(){
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
        
        try{
            
            this.balance += cantidad;
            
        } catch (Exception e){
            
            System.out.println("Error al depositar dinero en la cuenta.");
        }
    }
    
    //Metodo para retirar una cantidad al balance de una cuenta
    public void retirar(float cantidad){
        
        try{
            
            if ((getBalance() - cantidad) < 0) {
                
                System.out.println("No dispone del balance suficiente para realizar esta operacion.");
            }
            
            else{
                
                this.balance -= cantidad;
            }
            
        } catch (Exception e){
            
            System.out.println("Error al retirar dinero de la cuenta.");
        }
    }
    
    //Metodo que aplica una tasa de interes al balance de una cuenta
    public void aplicarTasaIntereses(){
        
        setBalance((getBalance() - (getBalance()*interes)/100));
    }
    
    //Metodo que impide al cliente pedir otro prestamo si ya tienes uno pendiente de devolver
    public void pedirPrestamo(){
        
        if (!objetivoPrestamo) {
            
            System.out.print("Introduzca la cantidad del prestamo ("+ getInteres() +"% de intereses): ");
            //TERMINAR
            this.objetivoPrestamo = true;
        }
        
        else{
            
            System.out.println("Ya tiene un prestamo pendiente, no puede pedir otro prestamo.");
        }
    }
    
    //Metodo para mostrar los datos de la cuenta
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
