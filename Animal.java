
interface Animal {
    void makeSound();
    void eat();
}
abstract class Pet implements Animal {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }
}
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гавари:Гав гав!");
    }

    @Override
    public void eat() {
        System.out.println(name + " Сабака кушать как сабака");
    }
}
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гаварит: Мау мау!");
    }

    @Override
    public void eat() {
        System.out.println(name + " кот есть как кот ШОК");
    }
}

class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Варабей кричит кар-кар...");
    }

    @Override
    public void eat() {
        System.out.println("Варабей стрельнул зерно");
    }
}