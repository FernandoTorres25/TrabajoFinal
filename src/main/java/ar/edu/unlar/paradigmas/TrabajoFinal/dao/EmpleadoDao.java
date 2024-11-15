package ar.edu.unlar.paradigmas.TrabajoFinal.dao;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Empleado;
import java.util.ArrayList;


public interface EmpleadoDao {
    
    public ArrayList<Empleado> getAllEmpleados();
    public Empleado getEmpleadoByLegajo(String legajo);
    void insertEmpleado(Empleado empleado);
    void deleteEmpleado(String legajo);
    void updateEmpleado(Empleado empleado);
}
