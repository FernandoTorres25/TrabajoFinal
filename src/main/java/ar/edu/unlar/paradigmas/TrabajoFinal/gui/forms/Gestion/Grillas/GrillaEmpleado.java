package ar.edu.unlar.paradigmas.TrabajoFinal.gui.forms.Gestion.Grillas;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Empleado;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class GrillaEmpleado extends AbstractTableModel{
    private ArrayList<Empleado> datos = new ArrayList<>();
    private String[] columnas = {"ID", "Descripcion"};

    public GrillaEmpleado() {
    }

    public GrillaEmpleado(ArrayList<Empleado> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<Empleado> datos) {
        this.datos = datos;
    }
    
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado empleado = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return empleado.getId();
            case 1:
                return empleado.getLegajo();
            case 2:
                return empleado.getDocumento();
            case 3:
                return empleado.getNombre();
            case 4:
                return empleado.getApellido();
            case 5:
                return empleado.getFecha_alta();
                
              
                    
                
            default:
                return "";  
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
