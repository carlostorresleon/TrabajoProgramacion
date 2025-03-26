package proyectojava;

import java.util.ArrayList;

/**
 *
 * @author yaliora113
 */
public class Cliente {
    
    //Declaracion de atributos de la clase Cliente
    private String nombre;
    private String contraseña;
    private int edad;
    private String estadoCivil;
    
    private ArrayList<Cuenta> cuentas;
    private Deuda deuda;
    
    //Constructor de la clase Cliente
    public Cliente(String nombre, String contraseña, int edad, String estadoCivil, ArrayList<Cuenta> cuentas, Deuda deuda) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.cuentas = cuentas;
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
    
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public Deuda getDeuda() {
        return deuda;
    }
    
    public void setDeuda(Deuda deuda) {
        this.deuda = deuda;
    }
    
    //Metodo para agregar un objeto Cuenta a la clase Cliente
    public void agregarCuenta(Cuenta cuenta){
        
        try{
            
            cuentas.add(cuenta);
            System.out.println("Se ha agregado la cuenta con exito.");
            
        } catch (Exception e){
            
            System.out.println("Error al añadir la cuenta.");
        }
        
    }
    
    //Metodo para mostrar los datos del cliente
    @Override
    public String toString(){
        return (
                "Nombre: " + getNombre()
                + "Edad: " + getEdad()
                + "Estado civil: " + getEstadoCivil()
                + "Cuentas:" + getCuentas().toString()
        );
    }
}
