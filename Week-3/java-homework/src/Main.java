public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Fluffy", 2, "White");

        genericAnimal.speak();
        System.out.println("Name: " + genericAnimal.getName() + ", Age: " + genericAnimal.getAge());

        dog.speak();
        System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge() + ", Breed: " + dog.getBreed());

        cat.speak();
        System.out.println("Name: " + cat.getName() + ", Age: " + cat.getAge() + ", Color: " + cat.getColor());
    }
}