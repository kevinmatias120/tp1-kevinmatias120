package demonio;

import ar.edu.unahur.obj2.Alma;

public class DemonioDeSombra extends Demonio{

    public DemonioDeSombra(int maldad) {
        super(maldad);
    }

    @Override
    public boolean puedeCazar(Alma alma){
        return super.puedeCazar(alma) && alma.getNivelDeValor() < 50;
    }

    @Override
    public void atormentarAlma(Alma alma){
        super.atormentarAlma(alma);
        alma.setNivelDeValor(alma.getNivelDeValor() / 2);
    }
}
