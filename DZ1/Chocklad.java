public class Chocklad extends Product {
    public Chocklad(String name, Double cost, Double fatness) {
        super(name, cost);
        this.fatness = fatness;
    }
    public Chocklad(String name, Double cost) {
        super(name, cost);
    }
    public Chocklad(String name) {
        super(name);
    }

    private Double fatness;

    public Double getFatness() {
        return this.fatness;
    }

    public void setFatness(Double fatness) {
        this.fatness = fatness;
    }

    @Override
    public String toString() {
        return String.format("%s , жирность : %.2f", super.toString(), this.fatness);
    }
}
