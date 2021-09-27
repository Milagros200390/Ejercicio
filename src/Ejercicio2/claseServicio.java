/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Arbusta
 */
public class claseServicio {

    Scanner leer = new Scanner(System.in);

    public Revolver llenarRevolver() {
        Revolver revolver = new Revolver();

        revolver.setPosicionActual((int) (Math.random() * 6));
        revolver.setPosicionDelAgua((int) (Math.random() * 6));
        return revolver;

    }

    public Boolean mojar(Revolver revolver) {

        return revolver.getPosicionActual() == revolver.getPosicionDelAgua();

    }

    public void siguienteChorro(Revolver revolver) {
        if (revolver.getPosicionActual()==5) {
            revolver.setPosicionActual(0);
       }else{
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    
    }
    
    public Jugador disparo(Jugador jugador){
        
        Jugador jugador = new Jugador();
        
        System.out.println("Ingrese su color");
            jugador.setColor(leer.next());
        System.out.println("Ingrese su estado");
            auto.setEstado(leer.next());
        return auto;
        
    }
}
