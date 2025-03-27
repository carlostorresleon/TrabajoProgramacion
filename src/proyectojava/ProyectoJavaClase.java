/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojava;

/**
 *
 * @author Usuario
 */
public class ProyectoJavaClase {
    
    private static void menuLogin(){
        System.out.println("        +-------------+");
        System.out.println("        | LOGIN BANCO |");
        System.out.println("        +-------------+");
        System.out.println("");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Iniciar sesion");
        System.out.println("");
        System.out.print("Seleccione una opcion: ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuentaR = new Cuenta("Cuenta 1", 0, 10, null);
        Cliente cliente = new Cliente("Nombre 1", "1234", 15, "Soltero", cuentaR, new Deuda(0, false));
        
        //Cliente
        System.out.println(cliente.toString());
        
        //Cuenta
        System.out.println("BALANCE INICIAL: "+cuentaR.getBalance());
        
        cuentaR.depositar(150);
        System.out.println("BALANCE DESPUES DE DEPOSITAR: "+cuentaR.getBalance());
        
        cuentaR.aplicarTasaIntereses();
        System.out.println("BALANCE AL APLICAR INTERESES: "+cuentaR.getBalance());
        
        cuentaR.retirar(135);
        System.out.println("BALANCE AL RETIRAR DINERO (DISPONE DE LA CANTIDAD): "+cuentaR.getBalance());
        
        cuentaR.retirar(15);
        System.out.println("BALANCE AL RETIRAR DINERO (NO DISPONE DE LA CANTIDAD: )"+cuentaR.getBalance());
        
        cuentaR.pedirPrestamo();
        
        System.out.println(cliente.toString());
    }
    
}
