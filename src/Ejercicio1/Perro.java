/*
 Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 */

package Ejercicio1;

/**
 *
 * @author Arbusta
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
   
    
    //Constructores
    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        
        
    }

    public Perro() {
    }
    
    //Seter y Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + "\nTamaño: " + tamanio ;
    }
   

    

    
    
    
    
    
}
 
