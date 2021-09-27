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
public class suma {
    private Integer ventana;
    private Integer luces;
    private String color;
    private String estado;

    public suma(Integer ventana, Integer luces, String color, String estado) {
        this.ventana = ventana;
        this.luces = luces;
        this.color = color;
        this.estado = estado;
    }

    public suma() {
    }
    


    public Integer getVentana() {
        return ventana;
    }

    public void setVentana(Integer ventana) {
        this.ventana = ventana;
    }

    public Integer getLuces() {
        return luces;
    }

    public void setLuces(Integer luces) {
        this.luces = luces;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "suma{" + "ventana=" + ventana + ", luces=" + luces + ", color=" + color + ", estado=" + estado + '}';
    }

   
  
    
}
