package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;

public class ZonasCuerpo {
    private int id;
    private String region_anatomica;
    private String porcion_anatomica;
    private AccidenteZonaCuerpo accidentezonacuerpo;

    public ZonasCuerpo() {
    }

    public ZonasCuerpo(int id, String region_anatomica, String porcion_anatomica) {
        this.id = id;
        this.region_anatomica = region_anatomica;
        this.porcion_anatomica = porcion_anatomica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion_anatomica() {
        return region_anatomica;
    }

    public void setRegion_anatomica(String region_anatomica) {
        this.region_anatomica = region_anatomica;
    }

    public String getPorcion_anatomica() {
        return porcion_anatomica;
    }

    public void setPorcion_anatomica(String porcion_anatomica) {
        this.porcion_anatomica = porcion_anatomica;
    }

    @Override
    public String toString() {
        return this.region_anatomica;
    }
    
    
    
}
