import Items.SheetMusic;
import Items.SpareStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    SheetMusic sheetMusic;
    SpareStrings spareStrings;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("paper");
        spareStrings = new SpareStrings("metal");
    }

    @Test
    public void checkSheetMusicMarkUp(){
        assertEquals(3, sheetMusic.calculateMarkUp());
    }

    @Test
    public void checkSpareStringMarkUP(){
        assertEquals(2, spareStrings.calculateMarkUp());
    }
}
