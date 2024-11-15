/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;

/**
 *
 * @author WinUser
 */
public class TipoAccidente {
    private int id;
    private String descripcion_tipo;

    public TipoAccidente() {
    }

    public TipoAccidente(int id, String descripcion_tipo) {
        this.id = id;
        this.descripcion_tipo = descripcion_tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_tipo() {
        return descripcion_tipo;
    }

    public void setDescripcion_tipo(String descripcion_tipo) {
        this.descripcion_tipo = descripcion_tipo;
    }

    @Override
    public String toString() {
        return this.descripcion_tipo;
    }
    
    
}
