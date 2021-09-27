/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2;

/**
 *
 * @author Arbusta
 */
public class Revolver {
    private Integer posicionDelAgua;
    private Integer posicionActual;

    public Revolver(Integer posicionDelAgua, Integer posicionActual) {
        this.posicionDelAgua = posicionDelAgua;
        this.posicionActual = posicionActual;
    }

    public Revolver() {
    }

    public Integer getPosicionDelAgua() {
        return posicionDelAgua;
    }

    public void setPosicionDelAgua(Integer posicionDelAgua) {
        this.posicionDelAgua = posicionDelAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionDelAgua=" + posicionDelAgua + ", posicionActual=" + posicionActual + '}';
    }
     

    
    
}
