import Models.Dog;

import java.util.Scanner;

public class Main {

    static Dog dawg = new Dog("Khidir Karawita", "Pitbull", 3, 50);
    static Dog dawg2;
    static int option;
    final static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        dawg2 = new Dog();
        dawg2.setName("Khalid Kashmiri");
        dawg2.setAge(12);
        dawg2.setWeight(10);
        dawg2.setBreed("Yorkshire");

        menu();
    }

    private static void menu() {
        System.out.println("\n Welcome to the Dog Shelter!!! Select a dog you want to adopt.");
        System.out.println(dawg.toString());
        System.out.println(dawg2.toString());

        do {
            option = INPUT.nextInt();
            System.out.println("What do you want to do with your dog!"
            + "\n 1. Go for a walk"
            + "\n 2. Pet the dog"
            + "\n 3. Feed the dog"
            + "\n 4. Take a nap with the dog"
            + "\n 5. Sacrifice the dog for your cult");
        } while (option != 5);
    }
}
