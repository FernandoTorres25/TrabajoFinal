/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ar.edu.unlar.paradigmas.TrabajoFinal.controllers;

import java.sql.Connection;
import java.util.List;

public interface ICRUDController <ID, Entidad>{
    
    public void setConexion (Connection conexion);
    public List <Entidad> extraerTodo();
    public Entidad extraer(ID id);
    public boolean crear(Entidad entidad);
    public boolean eliminar(Entidad entidad);
    public boolean modificar(Entidad entidad);
    
}
