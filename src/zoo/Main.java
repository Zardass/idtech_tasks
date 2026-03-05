package zoo;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        lion.makeSound();
        monkey.makeSound();
        elephant.makeSound();


    }
}
