package ar.edu.unlar.paradigmas.TrabajoFinal.dao;


import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.ZonasCuerpo;
import java.util.ArrayList;

public interface ZonasCuerpoDao {
    
    public ArrayList<ZonasCuerpo> getAllZonasCuerpo();
    public ZonasCuerpo getZonaCuerpoByRegion(String region);
    void insertZonasCuerpo(ZonasCuerpo zonascuerpo);
    void deleteZonaCuerpo(String zonascuerpo);
    void updateZonaCuerpo(ZonasCuerpo zonasCuerpo);
    
}
