package ar.edu.unahur.obj2;

import demonio.Demonio;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
    List<Alma> almas;

    public Lugar(){
        this.almas = new ArrayList<>();
    }

    public void agregarAlma(Alma alma){
        almas.add(alma);
    }

    public void sacarAlma(Alma alma){ almas.remove(alma); }

    public void recibirAtaqueDemonio(Demonio demonio){
        almas.forEach( alma -> demonio.decidirDestinoAlma(alma) );
    }


}
