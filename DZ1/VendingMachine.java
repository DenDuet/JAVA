
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> prod) {
        this.products = prod;
    }

    public VendingMachine(String name, Double cost) {
        this.products = new ArrayList<>();
        products.add(new Product(name, cost));
    }
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            } 
        }
        return null;
    }
    public Product getProduct(Double cost) {
        for (Product product : products) {
            if (product.getCost().equals(cost)) {
                return product;
            } 
        }
        return null;
    }

    @Override
    public String toString() {
        String result="Список продуктов в аппарате: \n";
        for (Product product : products) {
            result = result.concat(product.toString())+"\n";
        }
        return result;
    }

}
