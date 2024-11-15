package ar.edu.unlar.paradigmas.TrabajoFinal.dao;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Ubicacion;
import java.util.ArrayList;


public interface UbicacionDao {
    
    public ArrayList<Ubicacion> getAllUbicaciones();
    public Ubicacion getUbicacionByLugar(String lugar);
    void insertUbicacion(Ubicacion ubicacion);
    void deleteUbicacion(String lugar);
    void updateUbicacion(Ubicacion ubicacion);
}
