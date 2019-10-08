package demonio;

import ar.edu.unahur.obj2.Alma;
import ar.edu.unahur.obj2.AsociacionDemoniaca;
import ar.edu.unahur.obj2.Lugar;

import java.util.ArrayList;
import java.util.List;

public class Demonio {
    int nivelDeMaldad;
    Lugar actual;
    int almasCazadas;
    int almasAtormentadas;
    List<Alma> cazados;


    public Demonio(int maldad){
        this.nivelDeMaldad = maldad;
        this.cazados = new ArrayList<>();
        this.almasCazadas = 0;
        this.almasAtormentadas = 0;
        this.actual = null;
    }

    public boolean puedeCazar(Alma alma){
        return nivelDeMaldad > alma.getNivelDeBondad();
    }

    public void atormentarAlma(Alma alma){
        alma.setNivelDeBondad(alma.getNivelDeBondad() - 5);
    }

    public void cazarAlmasEn(Lugar lugar){
        if(actual != null){
            if(actual != lugar){
                this.actual = lugar;
                almasCazadas = 0;
                almasAtormentadas = 0;
            }
        }else{
            this.actual = lugar;
        }
        actual.recibirAtaqueDemonio(this);
    }

    public void decidirDestinoAlma(Alma alma){
        if(this.puedeCazar(alma)){
            cazados.add(alma);
            almasCazadas ++;
            actual.sacarAlma(alma);
        }else{
            atormentarAlma(alma);
            almasAtormentadas++;
        }
        this.aumentoDeMaldad();
    }

    public void aumentoDeMaldad(){
        this.nivelDeMaldad = almasAtormentadas + 2*(almasCazadas);
    }

    public void darAlmas(AsociacionDemoniaca asociacion){
        cazados.forEach(alma -> asociacion.agregarAlma(alma));
        cazados.clear();
    }
}
