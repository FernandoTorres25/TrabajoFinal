package ar.edu.unlar.paradigmas.TrabajoFinal.dao;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.TipoAccidente;
import java.util.ArrayList;


public interface TipoAccidenteDao {
    
    public ArrayList<TipoAccidente> getAllTipoAccidentes();
    public TipoAccidente getTipoAccidenteByDescripcion(String descripcion);
    void insertTipoAccidente(TipoAccidente tipoAccidente);
    void deleteTipoAccidente(String descripcion);
    void updateTipoAccidente(TipoAccidente tipoAccidente);
}
