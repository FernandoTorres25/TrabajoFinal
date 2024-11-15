package ar.edu.unlar.paradigmas.TrabajoFinal.Objects;

import java.util.ArrayList;
import java.util.Iterator;

public class AccidenteZonaCuerpo {
    
    private int id;
    private int nro_accidente;
    private int cod_zona_cuerpo;
    private ArrayList<ZonasCuerpo> zonascuerpo;

    public AccidenteZonaCuerpo() {
    }

    public AccidenteZonaCuerpo(int id, int nro_accidente, int cod_zona_cuerpo) {
        this.id = id;
        this.nro_accidente = nro_accidente;
        this.cod_zona_cuerpo = cod_zona_cuerpo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNro_accidente() {
        return nro_accidente;
    }

    public void setNro_accidente(int nro_accidente) {
        this.nro_accidente = nro_accidente;
    }

    public int getCod_zona_cuerpo() {
        return cod_zona_cuerpo;
    }

    public void setCod_zona_cuerpo(int cod_zona_cuerpo) {
        this.cod_zona_cuerpo = cod_zona_cuerpo;
    }

    public int size() {
        return zonascuerpo.size();
    }

    public boolean addItem(ZonasCuerpo e) {
        return zonascuerpo.add(e);
    }

    public boolean removeItem(Object o) {
        return zonascuerpo.remove(o);
    }

    public Iterator<ZonasCuerpo> iterator() {
        return zonascuerpo.iterator();
    }
    
    
        
}
