package ar.edu.unahur.obj2;

import demonio.Demonio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsociacionDemoniaca {

    List<Demonio> demonios;
    List<Alma> almas;

    public AsociacionDemoniaca(){
        this.almas = new ArrayList<>();
        this.demonios = new ArrayList<>();
    }

    public void agregarDemonio(Demonio demonio){
        demonios.add(demonio);
    }

    public void agregarAlma(Alma alma){
        almas.add(alma);
    }

    public List<Alma> listaDeAlmas(){
        demonios.forEach(demonio -> demonio.darAlmas(this));
        return almas;
    }

    /*public Alma almaMasValiente(){
        return Collections.max(almas.stream().map(Alma::getNivelDeValor)).getClass();
    }
*/

}
