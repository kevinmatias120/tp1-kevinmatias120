package ar.edu.unahur.obj2;

public class Alma {
    int nivelDeBondad;
    int nivelDeValor;
    boolean esFriolento;
    boolean bloquearfrio;
    boolean bloquearBondad;

    public Alma(int bondad, int valor, boolean friolento){
        this.nivelDeBondad = bondad;
        this.nivelDeValor = valor;
        this.esFriolento = friolento;
        this.bloquearfrio = false;
        this.bloquearBondad = false;
    }

    public int getNivelDeBondad(){
        return nivelDeBondad;
    }

    public int getNivelDeValor(){
        return nivelDeValor;
    }

    public boolean getEsFriolento(){
        return esFriolento;
    }

    public void setNivelDeBondad(int valor){
        this.nivelDeBondad = valor;
        if(bloquearBondad = true){
            if(nivelDeBondad < 100){
                nivelDeBondad = 100;
            }
        }
    }

    public void setEsFriolento(boolean valor){
        if(bloquearfrio == false){
            this.esFriolento = valor;
        }
    }

    public void setNivelDeValor(int valor){
        this.nivelDeValor = valor;
    }

    public void luchaMarcialDemoniaca(){
        nivelDeValor = nivelDeValor * 2;
    }

    public void supervivenciaExtremaInfierno(){
        bloquearfrio = true;
        esFriolento = false;
    }

    public void cruzRoja(){
        bloquearBondad = true;
        if(nivelDeBondad < 100){
            nivelDeBondad = 100;
        }
    }
}
