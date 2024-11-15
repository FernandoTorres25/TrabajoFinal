
package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;


public class Motivo {
    private Integer id = 0;
    private String descripcion;

    public Motivo() {
    }
    
    public Motivo(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.descripcion;
    }
    
    
    
}
