package Instruments;

public class Piano extends Instrument {

    private String name = "Baby Grand";

    public Piano(String instrumentType) {
        super(instrumentType);
        this.setCostPrice(300);
        this.setSalePrice(400);
        this.setNoise("Plink plink plink");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
