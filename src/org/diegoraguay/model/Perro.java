
package org.diegoraguay.model;


public class Perro extends Animal{
    private boolean entrenado; 
    public void traerPelota(){
        System.out.println("El perro" + super.getNombre() + "trae la pelota");
    }
}
