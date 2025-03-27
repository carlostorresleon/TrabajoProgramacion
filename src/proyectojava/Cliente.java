/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;


/**
 *
 * @author Usuario
 */
public class Cliente {
    //Declaracion de atributos de la clase Cliente
    private String nombre;
    private String contraseña;
    private int edad;
    private String estadoCivil;
    
    private Cuenta cuenta;
    private Deuda deuda;
    
    //Constructor de la clase Cliente
    public Cliente(String nombre, String contraseña, int edad, String estadoCivil, Cuenta cuenta, Deuda deuda) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.cuenta = cuenta;
        this.deuda = deuda;
    }
    
    public Cliente(){}
    
    //Metodos set y get de los atributos de la clase Cliente
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public void setCuentas(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public Deuda getDeuda() {
        return deuda;
    }
    
    public void setDeuda(Deuda deuda) {
        this.deuda = deuda;
    }
    
    //Metodo para mostrar los datos del cliente
    @Override
    public String toString(){
        return (
                "Nombre: " + getNombre() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Estado civil: " + getEstadoCivil() + "\n"
                + "Cuenta:"  + "\n" + getCuenta().toString()
        );
    }
}
