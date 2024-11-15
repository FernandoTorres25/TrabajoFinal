package ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Empleado;
import ar.edu.unlar.paradigmas.TrabajoFinal.dao.EmpleadoDao;
import ar.edu.unlar.paradigmas.TrabajoFinal.utils.ConnectionDB;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmpleadoDaoImpl implements EmpleadoDao{

    @Override
    public ArrayList<Empleado> getAllEmpleados() {
        ArrayList<Empleado> listadoEmpleados = new ArrayList<>();
         try {
             String query = "select * from empleados;";
             
             Connection conn = ConnectionDB.obtenerConexion();
             
             try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(query))
                 
             {
                 while(rs.next()){
                     int id_empleado = rs.getInt("empleado_id");
                     String legajo = rs.getString("legajo");
                     int dni = rs.getInt("dni");
                     String nombre = rs.getString("nombre");
                     String apellido = rs.getString("apellido");
                     Date fecha_alta = rs.getDate("fecha_alta");
                                       
                     // Esto es un registro de la tabla empleados convertido en objeto
                     Empleado empleado = new Empleado(id_empleado, legajo, dni, nombre, apellido, fecha_alta);
                     listadoEmpleados.add(empleado);
                       
                 }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
         } catch (SQLException ex) {
                Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(MotivoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return listadoEmpleados;    }

    @Override
    public Empleado getEmpleadoByLegajo(String legajo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertEmpleado(Empleado empleado) {
    String sql = "INSERT INTO public.empleados (legajo,dni,nombre,apellido,fecha_alta) VALUES (?,?,?,?,?)";

        try {
            Connection conn = ConnectionDB.obtenerConexion();

            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            prepareStatement.setString(1, empleado.getLegajo());
            prepareStatement.setInt(2,empleado.getDocumento());
            prepareStatement.setString (3, empleado.getNombre());
            prepareStatement.setString (4, empleado.getApellido());
            prepareStatement.setString(5, sql);
            prepareStatement.executeUpdate();
            conn.close();
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("fallo al intentar escribir en la base de datos");
        }
    }

    @Override
    public void deleteEmpleado(String legajo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
