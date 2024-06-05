package Animal;

class Dog extends Mammal {

    @Override
    void move() {
        System.out.println("Dog runs");
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
