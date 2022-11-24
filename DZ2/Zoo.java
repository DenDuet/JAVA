import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Cat("Фурсик", "Классный", "Серый", 4, 2),
        new Dog("Тузик", "Сторожевой", "Рыжий", 4, 5), 
        new Fish("Fishka","guppy","rainbow",0,1),
        new Duck("Утище","McDuck", "Grey", 2, 2),
        new Dolphin("Муха", "Альфавина", "Черный", 0, 2)));
    }

    public void talk() {
        for (Speakable animal : getSpeakable()) {
            System.out.printf("%s\n", animal.speak());
        }
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal speakable : animals) {
            if (speakable instanceof Speakable) {
                result.add((Speakable) speakable);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<>();
        for (Animal runable : animals) {
            if (runable instanceof Runable) {
                result.add((Runable) runable);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal flyable : animals) {
            if (flyable instanceof Flyable) {
                result.add((Flyable) flyable);
            }
        }
        return result;
    }    

    public void run() {
        for (Runable animal : getRunable()) {
            System.out.printf("%s %s\n", animal.toString(), animal.run());
        }
    }
    public void fly() {
        for (Flyable animal : getFlyable()) {
            System.out.printf("%s %s\n", animal.toString(), animal.fly());
        }
    }

    public List<Sweemable> getSweemable() {
        List<Sweemable> result = new ArrayList<>();
        for (Animal sweemable : animals) {
            if (sweemable instanceof Sweemable) {
                result.add((Sweemable) sweemable);
            }
        }
        return result;
    }    

    public void sweem() {
        for (Sweemable animal : getSweemable()) {
            System.out.printf("%s %s\n", animal.toString(), animal.sweem());
        }
    }

    }

