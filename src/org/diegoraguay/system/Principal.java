package org.diegoraguay.system;
import org.diegoraguay.model.Perro; 
/**
 *
 * @author Diego Raguay
 */
public class Principal {
    //main y tabulador para escribir esto
    public static void main(String[] args) {
        //sout mas tabulador para escribir esto 
        System.out.println("Hola mundo estoy en kinal");
        Perro perro1 = new Perro(); 
        perro1.setNombre("Chuleta"); 
        System.out.println("El nombre del perro : " + perro1.getNombre());
        
        perro1.traerPelota();
    }
}
