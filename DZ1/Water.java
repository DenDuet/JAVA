public class Water extends Product {
    public Double gaz;

    public Water(String name) {
        super(name);
    }
    public Water(String name, Double cost) {
        super(name, cost);
    }
    public Water(String name, Double cost, Double gaz) {
        super(name, cost);
        this.gaz = gaz;
    }

    public Double getGaz() {
        return this.gaz;
    }

    public void setFatness(Double gaz) {
        this.gaz = gaz;
    }

    @Override
    public String toString() {
        return String.format("%s , газ : %.2f", super.toString(), this.gaz);
    }

}
