public class Dog extends Animal {
    private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void speak(){
        System.out.println("Woof! Woof!");
    }

    public String getBreed() {
        return breed;
    }
}
