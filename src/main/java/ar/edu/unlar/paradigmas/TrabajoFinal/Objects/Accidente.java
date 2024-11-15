package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;

import java.sql.Date;

public class Accidente {
    private int id;
    private int nro_empleado;
    private int cod_ubicacion;
    private int cod_motivo;
    private int tipoaccidente;
    private Date fecha_accidente;
    private Empleado empleado;

    public Accidente() {
    }

    public Accidente(int id, int nro_empleado, int cod_ubicacion, int cod_motivo, int tipoaccidente, Date fecha_accidente) {
        this.id = id;
        this.nro_empleado = nro_empleado;
        this.cod_ubicacion = cod_ubicacion;
        this.cod_motivo = cod_motivo;
        this.tipoaccidente = tipoaccidente;
        this.fecha_accidente = fecha_accidente;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNro_empleado() {
        return nro_empleado;
    }

    public void setNro_empleado(int nro_empleado) {
        this.nro_empleado = nro_empleado;
    }

    public int getCod_ubicacion() {
        return cod_ubicacion;
    }

    public void setCod_ubicacion(int cod_ubicacion) {
        this.cod_ubicacion = cod_ubicacion;
    }

    public int getCod_motivo() {
        return cod_motivo;
    }

    public void setCod_motivo(int cod_motivo) {
        this.cod_motivo = cod_motivo;
    }

    public int getTipoaccidente() {
        return tipoaccidente;
    }

    public void setTipoaccidente(int tipoaccidente) {
        this.tipoaccidente = tipoaccidente;
    }

    public Date getFecha_accidente() {
        return fecha_accidente;
    }

    public void setFecha_accidente(Date fecha_accidente) {
        this.fecha_accidente = fecha_accidente;
    }

  
    
    
}
