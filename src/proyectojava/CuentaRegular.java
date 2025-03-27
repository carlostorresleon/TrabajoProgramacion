/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;

import java.util.ArrayList;

/**
 *
 * @author yaliora113
 */
public class CuentaRegular extends Cuenta {
    
    //Constructor de la clase CuentaRegular
    public CuentaRegular(String nombreCuenta, float balance, float interes, ArrayList<Prestamo> prestamos) {
        
        super(nombreCuenta, balance, interes, prestamos);
    }
    
    public CuentaRegular(){}
    
    //Metodo que aplica una tasa de interes al balance de una cuenta
    @Override
    public void aplicarTasaIntereses(){
        
        super.aplicarTasaIntereses();
    }
    
    //Metodo que impide al cliente pedir otro prestamo si ya tienes uno pendiente de devolver
    @Override
    public void pedirPrestamo(){
        
        super.pedirPrestamo();
    }
    
    //Metodo para mostrar los datos de la clase CuentaRegular
    @Override
    public String toString(){
        
        return super.toString();
    }
}


