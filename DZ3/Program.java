public class Program {
    public static void main(String[] args) {
        Library<Animal> snowman = new Library<Animal>("Library of animals: ");
        snowman.add(new Animal("Stive","Man"));
        snowman.add(new Animal("Anna", "Woman")); 
        snowman.add(new Animal("Kittie","Cat"));
        snowman.add(new Animal("Joe","Dog"));

        for (SnowMan content : snowman) {
            System.out.println(content);
        }
    }
}
