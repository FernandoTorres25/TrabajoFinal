package ar.edu.unlar.paradigmas.TrabajoFinal.dao;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Motivo;
import java.util.ArrayList;


public interface MotivoDao {
    
    public ArrayList<Motivo> getAllMotivos();
    public Motivo getMotivoByDescripcion(String descripcion);
    void insertMotivo(Motivo motivo);
    void deleteMotivo(String descripcion);
    void updateMotivo(Motivo motivo);
}
