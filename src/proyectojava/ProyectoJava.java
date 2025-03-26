

package proyectojava;

/**
 *
 * @author Yasser Suliman Orange, Carlos Torres Leon
 */
public class ProyectoJava {
    
    public static void main(String[] args) {
        
        Cliente c = new Cliente("Nombre 1", "12345", 21, "Soltero", new Cuenta("Cuenta 1", 110, 0, new Prestamo()), new Deuda);
        
    }
    
}
