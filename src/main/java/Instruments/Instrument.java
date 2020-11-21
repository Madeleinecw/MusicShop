package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private String instrumentType;
    private int costPrice, salePrice;
    private String noise;

    public Instrument(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int calculateMarkUp() {
        return this.salePrice - this.costPrice;
    }

    public String play(){
        return this.noise;
    }
}
