public class Dog extends Animal implements Speakable, Runable {
    public Dog(String name, String breed, String color, Integer countLeg, Integer age) {
        super(name, breed, color, countLeg, age);
    }

    @Override
    public String speak() {   
        return "gav";
    }

    @Override
    public String run() {
        
        return "50 км/ч";
    }
}