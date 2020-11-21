package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings = 6;

    public Guitar(String instrumentType) {
        super(instrumentType);
        this.setCostPrice(35);
        this.setSalePrice(60);
        this.setNoise("Strummm");
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
