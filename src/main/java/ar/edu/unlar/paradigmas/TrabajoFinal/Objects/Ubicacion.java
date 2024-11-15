package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;


public class Ubicacion {
    
    private int id;
    private String lugar_ubi;

    public Ubicacion() {
    }

    public Ubicacion(int id, String lugar_ubi) {
        this.id = id;
        this.lugar_ubi = lugar_ubi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLugar_ubi() {
        return lugar_ubi;
    }

    public void setLugar_ubi(String lugar_ubi) {
        this.lugar_ubi = lugar_ubi;
    }

    @Override
    public String toString() {
        return this.lugar_ubi;
    }
    
    
}
