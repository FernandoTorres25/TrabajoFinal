package ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Accidente;
import ar.edu.unlar.paradigmas.TrabajoFinal.dao.AccidenteDao;
import ar.edu.unlar.paradigmas.TrabajoFinal.utils.ConnectionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccidenteDaoImpl implements AccidenteDao {

    public AccidenteDaoImpl(){
        
    }
    
    @Override
    public ArrayList<Accidente> getAllAccidentes() {
        ArrayList<Accidente> listadoAccidentes = new ArrayList<>();
         try {
             String query = "select * from accidentes;";
             
             Connection conn = ConnectionDB.obtenerConexion();
             
             try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(query))
                 
             {
                 while(rs.next()){
                     int id = rs.getInt("accidente_id");
                     int empleado_id = rs.getInt("empleado_id");
                     int ubicacion_id = rs.getInt("ubicacion_id");
                     int motivo_id = rs.getInt("motivo_id");
                     int tipoaccidente_id = rs.getInt("tipo_accidente_id");
                     Date fecha_accidente = rs.getDate("fecha_accidente");
                                        
                     // Esto es un registro de la tabla accidentes convertido en objeto
                     Accidente accidente = new Accidente(id, empleado_id, ubicacion_id, motivo_id, tipoaccidente_id, fecha_accidente);
                     listadoAccidentes.add(accidente);
                       
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
         } catch (SQLException ex) {
                Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listadoAccidentes;    }

    @Override
    public Accidente getAccidenteByEmpleado(int empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertAccidente(Accidente Accidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAccidente(int empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateAccidente(Accidente accidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
