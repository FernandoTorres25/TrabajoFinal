package ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Ubicacion;
import ar.edu.unlar.paradigmas.TrabajoFinal.dao.UbicacionDao;
import ar.edu.unlar.paradigmas.TrabajoFinal.utils.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UbicacionDaoImpl implements UbicacionDao{

     public UbicacionDaoImpl(){
    }

    @Override
    public ArrayList<Ubicacion> getAllUbicaciones() {
        ArrayList<Ubicacion> listadoUbicaciones = new ArrayList<>();
         try {
             String query = "select * from ubicaciones;";
             
             Connection conn = ConnectionDB.obtenerConexion();
             
             try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(query))
                 
             {
                 while(rs.next()){
                     int id = rs.getInt("ubicacion_id");
                     String lugar = rs.getString("lugar");
                     
                     // Esto es un registro de la tabla Registo convertido en objeto
                     Ubicacion ubicacion = new Ubicacion(id, lugar);
                     listadoUbicaciones.add(ubicacion);
                       
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
         } catch (SQLException ex) {
                Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listadoUbicaciones;
    }

    @Override
    public Ubicacion getUbicacionByLugar(String lugar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertUbicacion(Ubicacion ubicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteUbicacion(String lugar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateUbicacion(Ubicacion ubicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
  
    

