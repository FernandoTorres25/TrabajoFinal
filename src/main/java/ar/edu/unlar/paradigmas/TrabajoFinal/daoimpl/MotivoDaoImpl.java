package ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Motivo;
import ar.edu.unlar.paradigmas.TrabajoFinal.dao.MotivoDao;
import ar.edu.unlar.paradigmas.TrabajoFinal.utils.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MotivoDaoImpl implements MotivoDao {
        
    public MotivoDaoImpl(){

    }
            
    @Override
    public ArrayList<Motivo> getAllMotivos() {
        ArrayList<Motivo> listadoMotivos = new ArrayList<>();
         try {
             String query = "select * from motivos;";
             
             Connection conn = ConnectionDB.obtenerConexion();
             
             try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(query))
                 
             {
                 while(rs.next()){
                     int id = rs.getInt("motivo_id");
                     String descripcion = rs.getString("descripcion");
                     
                     // Esto es un registro de la tabla motivos convertido en objeto
                     Motivo motivo = new Motivo(descripcion);
                     listadoMotivos.add(motivo);
                       
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
         } catch (SQLException ex) {
                Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listadoMotivos;
    }

    @Override
    public Motivo getMotivoByDescripcion(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertMotivo(Motivo motivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteMotivo(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateMotivo(Motivo motivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
