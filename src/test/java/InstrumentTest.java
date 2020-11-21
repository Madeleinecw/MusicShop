import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Piano piano;
    Guitar guitar;

    @Before
    public void before(){
        piano = new Piano("keyed");
        guitar = new Guitar("string");
    }

    @Test
    public void checkPianoMarkUp(){
        assertEquals(100, piano.calculateMarkUp());
    }

    @Test
    public void checkPianoNoise(){
        assertEquals("Plink plink plink", piano.play());
    }

    @Test
    public void checkGuitarMarkUp(){
        assertEquals(25, guitar.calculateMarkUp());
    }

    @Test
    public void checkGuitarNoise(){
        assertEquals("Strummm", guitar.play());
    }
}
