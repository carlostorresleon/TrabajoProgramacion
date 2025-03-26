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
public class CuentaAhorros extends CuentaRegular {
    
    private int años;
    private float deuda;
    
    public CuentaAhorros(float deuda, int años, String nombreCuenta, float balance, float interes, ArrayList<Object> prestamos) {
        super(nombreCuenta, balance, interes, prestamos);
        this.años = años;
        this.deuda = deuda;
    }

    public CuentaAhorros(){}

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }
    
    public String toString(){
        
        return ( super.toString() + "\n"
                + "Años: " + getAños() + "\n"
                + "Deuda: " + getDeuda()
        );
    }
}
