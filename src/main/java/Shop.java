import Instruments.Guitar;
import Instruments.Instrument;
import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    Guitar guitar;
    private ArrayList<ISell> stock = new ArrayList<ISell>();

    public Shop() {
    }

    public Boolean addToStock(ISell newStock){
        Boolean successfullyAdded = stock.add(newStock);
        return successfullyAdded;
    }

    public Boolean removeFromStock(ISell soldStock){
        Boolean successfullyRemoved = stock.remove(soldStock);
        return successfullyRemoved;
    }
}
