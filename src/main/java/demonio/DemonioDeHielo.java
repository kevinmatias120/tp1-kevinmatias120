package demonio;

import ar.edu.unahur.obj2.Alma;

public class DemonioDeHielo extends Demonio {

    public DemonioDeHielo(int maldad){
        super(maldad);
    }

    @Override
    public boolean puedeCazar(Alma alma){
        return super.puedeCazar(alma) && alma.getEsFriolento() == true;
    }

    @Override
    public void atormentarAlma(Alma alma){
        super.atormentarAlma(alma);
        alma.setEsFriolento(true);
    }

}
