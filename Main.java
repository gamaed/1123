public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(" Чорный глаз");
        Animal cat = new Cat("Белый глаз");
        Animal bird = new Bird();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}