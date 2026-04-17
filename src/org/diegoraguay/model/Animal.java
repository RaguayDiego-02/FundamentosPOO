
package org.diegoraguay.model;

/**
 *
 * @author informatica
 */
public class Animal {
    //Atributos de clase
    private String nombre;
    private String color;
    private int edad;
    private double peso;
    private double altura;

    //metodo
    public void hablar(){
        System.out.println("El animal emite sonido");
    }
    //Setter y getter
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
}
