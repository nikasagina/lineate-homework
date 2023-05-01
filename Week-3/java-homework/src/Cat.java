public class Cat extends Animal {
    private final String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void speak(){
        System.out.println("Meow! Meow!");
    }

    public String getColor() {
        return color;
    }
}
