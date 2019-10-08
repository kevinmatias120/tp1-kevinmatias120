 package ar.edu.unahur.obj2;

import demonio.Demonio;
import demonio.DemonioDeFuego;
import demonio.DemonioDeHielo;
import demonio.DemonioDeSombra;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiabolicoTest {

    @BeforeMethod
    public void setUp() {

    }
    @Test
    public void demonioFuegoNoPuedeCazar(){
        Alma alma = new Alma(10,12,true);
        Demonio demoFuego = new DemonioDeFuego(20);

        assertEquals(demoFuego.puedeCazar(alma), false);
    }
    @Test
    public void demonioFuegoPuedeCazar(){
        Alma alma = new Alma(10,12,false);
        Demonio demoFuego = new DemonioDeFuego(20);

        assertEquals(demoFuego.puedeCazar(alma), true);
    }
    @Test
    public void demonioFuegoFaltaDeMaldad(){
        Alma alma = new Alma(10,12,true);
        Demonio demoFuego = new DemonioDeFuego(5);

        assertEquals(demoFuego.puedeCazar(alma), false);
    }
    @Test
    public void demonioFrioNoPuedeCazar(){
        Alma alma = new Alma(10,12,false);
        Demonio demoFrio = new DemonioDeHielo(20);

        assertEquals(demoFrio.puedeCazar(alma), false);
    }
    @Test
    public void demonioFrioPuedeCazar(){
        Alma alma = new Alma(10,12,true);
        Demonio demoFrio = new DemonioDeHielo(20);

        assertEquals(demoFrio.puedeCazar(alma), true);
    }
    @Test
    public void demonioSombraNoPuedeCazar(){
        Alma alma = new Alma(10,69,true);
        Demonio demoSombra = new DemonioDeSombra(20);

        assertEquals(demoSombra.puedeCazar(alma), false);
    }
    @Test
    public void demonioSombraPuedeCazar(){
        Alma alma = new Alma(10,40,false);
        Demonio demoFuego = new DemonioDeFuego(20);

        assertEquals(demoFuego.puedeCazar(alma), true);
    }
    @Test
    public void entrenamientoAlmaLuchaDemoniaca(){
        Alma alma = new Alma(5,10,false);
        alma.luchaMarcialDemoniaca();
        assertEquals(alma.getNivelDeValor(),20);
    }
    @Test
    public void entrenamientoAlmaSupervivenciaInfernal(){
        Alma alma = new Alma(5,10,true);
        assertEquals(alma.getEsFriolento(),true);
        alma.supervivenciaExtremaInfierno();
        assertEquals(alma.getEsFriolento(),false);
        alma.setEsFriolento(true);
        assertEquals(alma.getEsFriolento(),false);
    }
    @Test
    public void entrenamientoCruzRoja(){
        Alma alma = new Alma(5,10,true);
        alma.cruzRoja();
        assertEquals(alma.getNivelDeBondad(),100);
        alma.setNivelDeBondad(99);
        assertEquals(alma.getNivelDeBondad(),100);
        alma.setNivelDeBondad(120);
        assertEquals(alma.getNivelDeBondad(),120);
    }
}