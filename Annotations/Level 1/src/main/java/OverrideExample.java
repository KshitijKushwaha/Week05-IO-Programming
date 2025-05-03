class Animal {
    public void makeSound() {
        System.out.println("Animal noise");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
}
public class OverrideExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}