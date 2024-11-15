package ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.AccidenteZonaCuerpo;
import ar.edu.unlar.paradigmas.TrabajoFinal.dao.AccidenteZonaCuerpoDao;
import ar.edu.unlar.paradigmas.TrabajoFinal.utils.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AccidenteZonaCuerpoDaoImpl implements AccidenteZonaCuerpoDao{

    @Override
    public ArrayList<AccidenteZonaCuerpo> getAllAccidentesZonaCuerpo() {
        ArrayList<AccidenteZonaCuerpo> listadoAccidenteZonaCuerpos = new ArrayList<>();
         try {
             String query = "select * from accidentes_zonas_cuerpo;";
             
             Connection conn = ConnectionDB.obtenerConexion();
             
             try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(query))
                 
             {
                 while(rs.next()){
                     int id = rs.getInt("accidente_zona_cuerpo_id");
                     int accidente_id = rs.getInt("accidente_id");
                     int zonacuerpo_id = rs.getInt("zona_cuerpo_id");
                     
                     // Esto es un registro de la tabla accidentes_zonas_cuerpo convertido en objeto
                     AccidenteZonaCuerpo accidenteZonaCuerpo = new AccidenteZonaCuerpo(id, accidente_id, zonacuerpo_id);
                     listadoAccidenteZonaCuerpos.add(accidenteZonaCuerpo);
                       
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
         } catch (SQLException ex) {
                Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listadoAccidenteZonaCuerpos;    }

    @Override
    public AccidenteZonaCuerpo getAccidenteZonaCuerpoByNroAccidente(int nro_accidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertAccidenteZonaCuerpo(AccidenteZonaCuerpo accidenteZonaCuerpo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAccidenteZonaCuerpo(int nro_accidente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateAccidenteZonaCuerpo(AccidenteZonaCuerpo accidenteZonaCuerpo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
