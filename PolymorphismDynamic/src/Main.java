import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("Press 1 for dog or press 2 for cat..");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.makeSound();
        } else if (choice == 2) {
            animal = new Cat();
            animal.makeSound();
        } else {
            animal = new Animal();
            System.out.println("INVALID CHOICE..");
            animal.makeSound();
        }
    }
}
