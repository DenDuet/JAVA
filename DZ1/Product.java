public class Product {
    public String name;
    public Double cost;

    public Product(String name, Double cost) {
        this(name);
        this.cost = cost;
    }

    public Product(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return String.format("Продукт : %s, цена : %.2f", name, cost);
    }
}
