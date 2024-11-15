package ar.edu.unlar.paradigmas.TrabajoFinal.gui.forms.Gestion.Grillas;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Motivo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class GrillaMotivo extends AbstractTableModel{
    private ArrayList<Motivo> datos = new ArrayList<>();
    private String[] columnas = {"ID", "Descripcion"};

    public GrillaMotivo() {
    }

    public GrillaMotivo(ArrayList<Motivo> datos) {
        this.datos = datos;
    }

    public void setDatos(ArrayList<Motivo> datos) {
        this.datos = datos;
    }
    
    
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motivo motivo = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return motivo.getId();
            case 1:
                return motivo.getDescripcion();
            default:
                return "";  
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
