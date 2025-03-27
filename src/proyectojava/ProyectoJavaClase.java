/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectojava;

import java.util.Scanner;
import java.lang.Exception;

/**
 *
 * @author Usuario
 */
public class ProyectoJavaClase {
    
    private static void añadirCliente(Cliente c){
        
        Scanner e = new Scanner(System.in);
        
        String nombre, contraseña, estado_civil;
        int edad;
        boolean valido = false;
        
        do {
            try {
                
                System.out.print("Introduzca el nombre del cliente (Sin espacios): ");
                nombre = e.nextLine();
                
                if (nombre.contains(" ")) {
                    
                    valido = false;
                    throw new Exception();
                }
                
                else{
                    
                    valido = true;
                }
                
            } catch (Exception error) {
                
                System.out.println("error");
            }
        } while (!valido);
        
        do {
            try {
                
                System.out.print("Introduzca la contraseña del cliente (Sin espacios): ");
                contraseña = e.nextLine();
                
            } catch (Exception error) {
                
                System.out.println("error");
            }
        } while (!valido);
        
        do {
            try {
                
                System.out.print("Introduzca la edad del cliente: ");
                edad = e.nextInt();
                
            } catch (Exception error) {
                
                System.out.println("error");
            }
        } while (!valido);
        
        do {
            try {
                
                System.out.print("Introduzca el estado civil del cliente: ");
                estado_civil = e.nextLine().replace(" ", ".");
                
            } catch (Exception error) {
                
                System.out.println("error");
            }
        } while (!valido);
    }
    
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
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner e = new Scanner(System.in);
        
        Cuenta cuentaR = new Cuenta("Cuenta 1", 0, 10, null);
        Cliente cliente = new Cliente();
        Banco banco = new Banco();
        GestorArchivo gestor = new GestorArchivo();
        
        String usuario, contraseña;
        /*
        gestor.crearLog();
        banco.cargarClientes();
        
        System.out.print("Introduzca el usuario: ");
        usuario = e.nextLine();
        System.out.print("Introduzca la contraseña: ");
        contraseña = e.nextLine();
        
        banco.loginBanco(usuario, contraseña);
        
        banco.guardarCliente(cliente);
        */
        añadirCliente(cliente);
    }
}
