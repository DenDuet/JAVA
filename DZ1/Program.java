import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> prod = new ArrayList<>();
        prod.add(new Chocklad("Шоколад Бабаевский", 100.0, 85.0));
        prod.add(new Chocklad("Шоколад Степ", 50.0, 35.0));
        prod.add(new Water("Вода минеральная", 100.0, 55.0));
        prod.add(new Water("Вода питьевая газированная", 100.0, 35.0));
        prod.add(new Product("Чипсы", 60.0));
        prod.add(new Product("Наггетсы", 120.0));
        prod.add(new Product("Сникерс", 30.0));
        prod.add(new Product("Марс", 35.0));
        prod.add(new Product("Баунти", 32.0));
        prod.add(new Product("Пепси-кола", 100.0));
        VendingMachine v1 = new VendingMachine(prod);
        
        System.out.println(v1);
        System.out.println(v1.getProduct(30.0));
        System.out.println(v1.getProduct("Шоколад Степ"));
        Product p1 = new Product("Фанта", 25.00);
        System.out.println(p1);
        Water w1 = new Water("Питьевая без газа", 35.0, 0.0);
        System.out.println(w1);
        System.out.println(w1.getGaz());
    }
}
