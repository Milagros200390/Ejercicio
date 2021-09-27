/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones;

import java.util.Scanner;

/**
 *
 * @author Arbusta
 */
public class claseServicio {
    Scanner leer = new Scanner(System.in);
    public suma crearAuto(){
        
        suma auto = new suma();
        
        System.out.println("Ingrese su color");
            auto.setColor(leer.next());
        System.out.println("Ingrese su estado");
            auto.setEstado(leer.next());
        return auto;
        
    }

    public multi crearDatos(){
        multi datos = new multi();
        System.out.println("Ingrese su marca");
            datos.setMarca(leer.next());
        System.out.println("Ingrese su modelo");
            datos.setModelo(leer.next());
        return datos;
    }
}
