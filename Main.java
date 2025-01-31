import Models.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Dog> dogs = new ArrayList<>();
    static int option;
    final static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {


        initializeDoggos();
        Dog yourDog = showDogsAndSelection();
        menu(yourDog);
    }

    private static void initializeDoggos() {
        dogs.add(new Dog("Khidir Karawita", "Pitbull", 3, 50));
        dogs.add(new Dog("Khidir ", "Borzoi", 3, 20));
        dogs.add(new Dog("Karawita", "Chihuahua", 1, 7));

        Dog dawg2;

        dawg2 = new Dog();
        dawg2.setName("Khalid Kashmiri");
        dawg2.setAge(12);
        dawg2.setWeight(10);
        dawg2.setBreed("Yorkshire");

        dogs.add(dawg2);
    }

    private static Dog showDogsAndSelection() {
        System.out.print("\n Welcome to the Dog Shelter!!! These dogs are willing to get adopted!");
        for (int i = 0; i < dogs.size() ; i++) {
            System.out.println(i + "  " + dogs.get(i));
        }
        System.out.print("Please select the dog you want to adopt: ");
        int selectedDog = INPUT.nextInt() - 1;
        return dogs.get(selectedDog);
    }

    private static void menu(Dog yourDog) {
        do {
            System.out.println("What do you want to do with " + yourDog.getName() + "!"
            + "\n 1. Go for a walk"
            + "\n 2. Pet the dog"
            + "\n 3. Feed the dog"
            + "\n 4. Take a nap with the dog"
            + "\n 5. Sacrifice the dog for your cult");

            option = INPUT.nextInt();

            switch (option) {
                case 1:
                    yourDog.walkTheDog();
                    break;
                case 2:
            }
        } while (option != 5);
    }
}
