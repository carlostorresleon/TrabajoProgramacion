/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Deuda {
    private float total;
    private boolean enMora;
    private ArrayList<Prestamo> listaPrestamos = new ArrayList();

    public Deuda(float total, boolean enMora) {
        this.total = total;
        this.enMora = enMora;
    }

    public float getTotal() {
        return total;
    }

    public boolean isEnMora() {
        return enMora;
    }
    
    
    public void checkPrestamo(){
        float x=0;
        for (Prestamo prestamo : listaPrestamos) {
            total = prestamo.getMonto() + total; 
        }
        if(total>x){
            System.out.println("Esta cuenta no puede obtener mas prestamos");
        }else{System.out.println("Redirigiendo al menu de prestamos");}
    }
    
    public void agregarPrestamo(Prestamo prestamo){
        listaPrestamos.add(prestamo);
        System.out.println("Se ha añadido el prestamo "+prestamo);
    }
    
    public void calcultarTotal(){
        for (Prestamo prestamo : listaPrestamos) {
            total = prestamo.getMonto() + total; 
        }
        System.out.println("El total de los prestamos es: "+total);
    }
    
    @Override
    public String toString(){
        return "bla bla bla bla";
    }
}
