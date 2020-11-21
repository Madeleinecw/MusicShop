package Items;

import Interfaces.ISell;

public abstract class Items implements ISell {

    private int costPrice, salePrice;
    private String materialType;

    public Items(String materialType) {
        this.materialType = materialType;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int calculateMarkUp(){
        return salePrice - costPrice;
    }


}
