public class Fish extends Animal implements Sweemable {

    public Fish(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
        
    }

    @Override
    public String sweem() {
        return "10 км/ч";
    }
    
}
