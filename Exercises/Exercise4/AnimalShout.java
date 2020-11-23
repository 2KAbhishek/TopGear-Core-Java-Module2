public class AnimalShout {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.shout();

        animal = new Dog();
        animal.shout();
        animal = new Horse();
        animal.shout();
        animal = new Cat();
        animal.shout();
    }
}
