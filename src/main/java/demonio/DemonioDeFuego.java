package demonio;

import ar.edu.unahur.obj2.Alma;

public class DemonioDeFuego extends Demonio{

    public DemonioDeFuego(int maldad) {
        super(maldad);
    }

    @Override
    public boolean puedeCazar(Alma alma){
        return super.puedeCazar(alma) && alma.getEsFriolento() == false;
    }

    @Override
    public void atormentarAlma(Alma alma){
        super.atormentarAlma(alma);
        alma.setEsFriolento(false);
    }
}
