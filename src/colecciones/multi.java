/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colecciones;

/**
 *
 * @author Arbusta
 */
public class multi {
    private String marca;
    private String seguro;
    private Integer serie;
    private String modelo; 

    public multi() {
    }

    public multi(String marca, String seguro, Integer serie, String modelo) {
        this.marca = marca;
        this.seguro = seguro;
        this.serie = serie;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "multi{" + "marca=" + marca + ", seguro=" + seguro + ", serie=" + serie + ", modelo=" + modelo + '}';
    }
    
    
}


