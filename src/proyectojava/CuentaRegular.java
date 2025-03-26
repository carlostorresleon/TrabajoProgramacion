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
    
    private int años;
    private float deuda;

    public CuentaRegular(int años, float deuda, String nombreCuenta, float balance, float interes, ArrayList<Object> prestamos) {
        
        super(nombreCuenta, balance, interes, prestamos);
        this.años = años;
        this.deuda = deuda;
    }
    
    public CuentaRegular(){
        
        super();
    }
    
    @Override
    public void aplicarTasaIntereses() {
    
        super.aplicarTasaIntereses();
    }

    @Override
    public void pedirPrestamo() {
     
        super.pedirPrestamo();
    }

    @Override
    public String toString() {
        
        return super.toString() + "\n"
                + "Años: " 
                + "Deuda: ";
    }
}
