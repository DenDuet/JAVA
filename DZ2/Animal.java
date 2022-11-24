public abstract class Animal {
    protected String name;
    protected String breed;
    protected String color;
    protected Integer countLegs;
    protected Integer age;


    public Animal(String name, String breed, String color, Integer countLegs, Integer age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.countLegs = countLegs;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public Integer getCountLegs() {
        return countLegs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        
        return String.format("%s ", this.name);
}
}