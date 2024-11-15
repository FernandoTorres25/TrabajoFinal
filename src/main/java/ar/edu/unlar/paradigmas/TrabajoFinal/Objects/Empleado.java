
package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;


//import java.util.ArrayList;
import java.util.Date;
//import java.util.Iterator;

public class Empleado {
    private int id;
    private String legajo;
    private int documento;
    private String nombre;
    private String apellido;
    private Date fecha_alta;
    //private ArrayList<Accidente> accidentes;
   

    public Empleado() {
    }

    public Empleado(int id, String legajo, int documento, String nombre, String apellido, Date fecha_alta) {
        this.id = id;
        this.legajo = legajo;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_alta = fecha_alta;
    }

    public Empleado(String legajo, int documento, String nombre, String apellido, Date fecha_alta) {
        this.legajo = legajo;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_alta = fecha_alta;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    /*public int size() {
        return accidentes.size();
    }

    public boolean add(Accidente e) {
        return accidentes.add(e);
    }

    public boolean remove(Object o) {
        return accidentes.remove(o);
    }

    public Iterator<Accidente> iterator() {
        return accidentes.iterator();
    }

    */
    
    @Override
    public String toString() {
        return this.legajo;
    }
        
}
