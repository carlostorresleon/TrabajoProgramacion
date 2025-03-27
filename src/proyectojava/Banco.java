/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Banco {
    private HashMap<String,Cliente> listaClientes = new HashMap <>();
    
    public boolean loginBanco(String nombreCli, String claveCli){
        Cliente cliente = listaClientes.get(nombreCli);
        
        if(cliente!= null && claveCli.equals(cliente.getContraseña())){
            System.out.println("Bienvenido "+cliente.getNombre());
            return true;
        }else{
            System.out.println("No se ha podido encontrar al usuario "+nombreCli);
            return false;}
        
        /*boolean check = false;
        for(Map.Entry<String, Cliente> clientillo: listaClientes.entrySet()) {
            if(nombreCli.equals(clientillo.getKey()) && claveCli.equals(clientillo.getValue().getContraseña())){
                return check=true;
            }
        }
        if(!check){
            System.out.println("El usuario no se ha encontrado en la base de datos");
            return false;
        }else{System.out.println("Wiwi");return true;}*/
        
    }

    public void cargarClientes() {
        Path ruta = Paths.get(System.getProperty("user.home"), "Desktop", "Datos", "clientes.txt");

        try {
            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {
                String[] partes = linea.split(" ");
                //Division de las partes
                if (partes.length == 9) {
                    String nombre = partes[0];
                    String contraseña = partes[1];
                    int edad = Integer.parseInt(partes[2]);
                    String estadoCivil = partes[3];

                    float deudaMonto = Float.parseFloat(partes[4]);
                    boolean enMora = Boolean.parseBoolean(partes[5]);
                    
                    Deuda deuda = new Deuda(deudaMonto, enMora);

                    String nombreCuenta = partes[6];
                    float balance = Float.parseFloat(partes[7]);
                    float interes = Float.parseFloat(partes[8]);
                    Cuenta cuenta = new Cuenta(nombreCuenta, balance, interes,new ArrayList<>());

                    Cliente cliente = new Cliente(nombre, contraseña, edad, estadoCivil, cuenta, deuda);
                    listaClientes.put(nombre, cliente);
                } else {
                    System.err.println("Error en la linea: " + linea);
                }
            }

            System.out.println("Clientes cargados correctamente.");

        } catch (IOException e) {
            System.err.println("Error al leer el archivo de clientes: " + e.getMessage());
        }
    }

    public HashMap<String, Cliente> getListaClientes() {
        return listaClientes;
    }


    
    public boolean checkCliente(String nombreComp){
        return !listaClientes.containsKey(nombreComp);
    }
    
    public void guardarCliente(Cliente cliente){
        if(checkCliente(cliente.getNombre())){
            listaClientes.put(cliente.getNombre(),cliente);
        }else{System.out.println("No se puede guardar un cliente ya existente");}
    }
     
}
