public class Duck extends Animal implements Flyable, Runable, Speakable {

    public Duck(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String fly() {
        return "75 км/ч";
    }

    @Override
    public String run() {
        return "5 км/ч";
    }

    @Override
    public String speak() {

        return "Krja";
    }
    
}
