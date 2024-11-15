package ar.edu.unlar.paradigmas.TrabajoFinal.dao;


import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Accidente;
import java.util.ArrayList;


public interface AccidenteDao {
    
    public ArrayList<Accidente> getAllAccidentes();
    public Accidente getAccidenteByEmpleado(int empleado);
    void insertAccidente(Accidente Accidente);
    void deleteAccidente(int empleado);
    void updateAccidente(Accidente accidente);
}
