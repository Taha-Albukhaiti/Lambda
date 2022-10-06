public class Beverage {
    private String name;
    private double volume;
    private boolean containsAlcohol;
    private double alacoholAmount;
    private Packaging packaging;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public double getAlacoholAmount() {
        return alacoholAmount;
    }

    public void setAlacoholAmount(double alacoholAmount) {
        this.alacoholAmount = alacoholAmount;
    }

    public boolean isContainsAlcohol() {
        return containsAlcohol;
    }

    public void setContainsAlcohol(boolean containsAlcohol) {
        this.containsAlcohol = containsAlcohol;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

