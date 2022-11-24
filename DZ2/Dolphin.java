public class Dolphin extends Animal implements Speakable, Sweemable {

    public Dolphin(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }

    @Override
    public String sweem() {
        return "65 км/ч";
    }

    @Override
    public String speak() {

        return "ja-a";
    }

}
