package ar.edu.unlar.paradigmas.TrabajoFinal;

import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Accidente;
import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.AccidenteZonaCuerpo;
import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Empleado;
import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Motivo;
import ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Ubicacion;
import ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl.AccidenteDaoImpl;
import ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl.AccidenteZonaCuerpoDaoImpl;
import ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl.EmpleadoDaoImpl;
import ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl.MotivoDaoImpl;
import ar.edu.unlar.paradigmas.TrabajoFinal.daoimpl.UbicacionDaoImpl;
import ar.edu.unlar.paradigmas.TrabajoFinal.gui.Principal;
import java.util.ArrayList;



public class TrabajoFinal {

    public static ArrayList<Motivo> motivos = new ArrayList<Motivo>();
    public static void main(String[] args) {
        //Agregar un motivo a nuestro data source
        Principal p = new Principal();
        p.setVisible(true);
        
        motivos.add(new Motivo("asdasd"));
        motivos.add(new Motivo("holamundo"));
        
        AccidenteDaoImpl accidenteDao = new AccidenteDaoImpl();
        AccidenteZonaCuerpoDaoImpl accidente_zonas_cuerpo = new AccidenteZonaCuerpoDaoImpl();
        EmpleadoDaoImpl empleadoDao = new EmpleadoDaoImpl();
        MotivoDaoImpl motivodao = new MotivoDaoImpl();
        UbicacionDaoImpl ubicaciondao = new UbicacionDaoImpl();
        
        
        ArrayList<Accidente> listadoAccidente = accidenteDao.getAllAccidentes();
        ArrayList<AccidenteZonaCuerpo> listadoaccidentes_zonas_cuerpo = accidente_zonas_cuerpo.getAllAccidentesZonaCuerpo();
        ArrayList<Empleado> listadoEmpleados = empleadoDao.getAllEmpleados();
        ArrayList<Motivo> listadoMotivos = motivodao.getAllMotivos();
        ArrayList<Ubicacion> listadoUbicaciones = ubicaciondao.getAllUbicaciones();
        
        
        
    }   
}
