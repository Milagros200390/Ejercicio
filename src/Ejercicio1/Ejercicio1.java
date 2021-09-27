/*
  Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */

package Ejercicio1;

/**
 *
 * @author Arbusta
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Perro perro1 = new Perro("Luna", "Caniche" , 2 , "Chico");
    Perro perro2 = new Perro("Fores", "Buldog" , 4 , "Mediano");
    
    Persona persona1 =new Persona("Camilo", "Rosales", 25, 94478954, perro1);
    Persona persona2 =new Persona("Maria", "Fernandez", 28, 94189412, perro2);
    
    System.out.println(persona1);
    System.out.println(persona2);
      
}}
