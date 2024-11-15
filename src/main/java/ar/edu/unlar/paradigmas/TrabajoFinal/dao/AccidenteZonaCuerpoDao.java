package ar.edu.unlar.paradigmas.TrabajoFinal.dao;


import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.AccidenteZonaCuerpo;
import java.util.ArrayList;


public interface AccidenteZonaCuerpoDao {
    
    public ArrayList<AccidenteZonaCuerpo> getAllAccidentesZonaCuerpo();
    public AccidenteZonaCuerpo getAccidenteZonaCuerpoByNroAccidente(int nro_accidente);
    void insertAccidenteZonaCuerpo(AccidenteZonaCuerpo accidenteZonaCuerpo);
    void deleteAccidenteZonaCuerpo(int nro_accidente);
    void updateAccidenteZonaCuerpo(AccidenteZonaCuerpo accidenteZonaCuerpo);
}
