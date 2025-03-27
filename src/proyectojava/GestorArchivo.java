/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

/*Esta clase va a lidiar con la gestion y creacion de documentos, todo metodo que en su camelcase tenga Log
estara relacionado con la gestion del usuario/contraseña 

Por ahora encontramos metodos de:

confirmar si el archivo existe
crearLog
leerLog
modLog(Por implementer)
eliminarLog


Todos los metodos y paths funcionan
*/

public class GestorArchivo {
    private final Path login = Paths.get(System.getProperty("user.home"),"Desktop","Datos");
    private final Path login1 = Paths.get(System.getProperty("user.home"),"Desktop","Datos","clientes.txt");
    private HashMap<String,Cliente> cargarClientes = new HashMap<>();
    public boolean confirmacion(){
        return Files.exists(login1);
    }
    
    public void crearLog(){
        if(!confirmacion()){
            try{
                Path ruta = Files.createDirectories(login).resolve("log.txt");
                Files.createFile(ruta);
            }catch(IOException e){System.out.println("Error: "+e);}
        }else{System.out.println("Ya existe un archivo creado en esa ruta");}    
    }
    
    public void leerLog(){
        String linea;
        
        try(BufferedReader lectura = Files.newBufferedReader(login1)){
            while((linea = lectura.readLine())!=null){
                System.out.println(linea);
            }
        }catch(IOException e){System.out.println("Error al leer el archivo: "+e);}
    }
    
    public void modLog(){
        //Todavia no existen datos para modificar
    }
    
    public void eliminarLog(){
        try{
            Files.deleteIfExists(login1);
            Files.deleteIfExists(login);
        }catch(IOException e){System.out.println("Error al intentar borrar el archivo : "+e);}
    }   
}
