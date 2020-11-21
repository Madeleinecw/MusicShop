import Instruments.Guitar;
import Instruments.Piano;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    SheetMusic sheetMusic;


    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano("Keyed");
        shop.addToStock(new Guitar("Stringed"));
        shop.addToStock(piano);
        shop.addToStock(new SheetMusic("Paper"));

    }

    @Test
    public void canAddToStock(){
        assertEquals(true, shop.addToStock(new Piano("Player")));
    }

    @Test
    public void canRemoveFromStock(){
        assertEquals(true, shop.removeFromStock(piano));
    }
}
