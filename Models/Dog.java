package Models;

import java.util.Scanner;

public class Dog {
    Scanner input = new Scanner(System.in);
    private String name;
    private String breed;
    private int age;
    private int weight;
    private int energy;
    private int hunger;
    private int voice;
    private int happiness;
    private static final int MAX_ENERGY = 10;
    private static final int MAX_HUNGER = 10;
    private static final int MAX_VOICE = 10;
    private static final int MAX_HAPPINESS = 10;
    private static final int MIN_ENERGY = 0;
    private static final int MIN_HUNGER = 0;
    private static final int MIN_VOICE = 0;
    private static final int MIN_HAPPINESS = 0;


    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.energy = MAX_ENERGY;
        this.hunger = 0;
        this.voice = MAX_VOICE;
        this.happiness = MAX_HAPPINESS / 2;
    }

    public Dog() {
        this.energy = MAX_ENERGY;
        this.hunger = 0;
        this.voice = MAX_VOICE;
        this.happiness = MAX_HAPPINESS / 2;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() throws InterruptedException {
        if (voice >= MAX_VOICE) System.out.println("WOOF WOOF WOOOOOOOF WOOF" + "\n What the dog doin?"  );
        else if (voice > 4) System.out.println("Woof woof!");
        else if (voice <= MIN_VOICE) {
            System.out.println("...");
            Thread.sleep(2000);
            System.out.println(name + " is trying to bark but has no voice");
        } else System.out.println("Woof");

        voice -= 3;
        energy--;
    }

    public void petTheDog() {
        System.out.println("You pet your dog! " + name + "  is happy!");
        happiness++;

        checkStats();
    }

    public void eat() {
        System.out.print("What will you give the dog to eat? ");
        String foodName = input.nextLine();
        System.out.println(name + " is eating " + foodName + ", it probably enjoys the meal.");

        hunger -= 6;
        happiness += 2;

        checkStats();
    }

    public void sleep() throws InterruptedException {
        int sleepTime;

        System.out.print("How many hours do you want your dog to sleep? ");
        sleepTime = input.nextInt();

        energy += sleepTime;
        voice += sleepTime;

        System.out.print(name + " is profoundly sleeping");
        for (int i = 0; i <  sleepTime; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
        checkStats();
    }

    public void walkTheDog() {
        System.out.println("You walked the dog.");

        energy -= 2;
        hunger += 4;
        happiness++;

        checkStats();
    }

    private static boolean checkIfActionIsPossible() {
    }

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", breed: " + breed + '\'' +
                ", age: " + age +
                ", weight: " + weight +
                ", energy: " + energy +
                ", hunger: " + hunger +
                ", voice: " + voice +
                ", happiness: " + happiness;
    }

    private void checkStats() {
        checkHunger();
        checkHappiness();
        checkEnergy();
        checkVoice();
    }

    private void checkVoice() {
        if (voice >= MAX_VOICE) {
            voice = MAX_VOICE;
        } else if (voice <= MIN_VOICE) {
            voice = MIN_VOICE;
        }
    }

    private void checkEnergy() {
        if (energy >= MAX_ENERGY) {
            energy = MAX_ENERGY;
            System.out.println("Your dog is full of energy!");

        } else if (energy <= MIN_ENERGY) {
            energy = MIN_ENERGY;
            System.out.println("Your dog is very tired!");
            voice -= 3;
        }
    }

    private void checkHappiness() {
        if (happiness >= MAX_HAPPINESS) {
            happiness = MAX_HAPPINESS;
            System.out.println("You have the happiest doggo!");

        } else if (happiness <= MIN_HAPPINESS) {
            happiness = MIN_HAPPINESS;
            System.out.println("Your dog is depressed.");
        }
    }

    private void checkHunger() {
        if (hunger >= MAX_HUNGER) {
            hunger = MAX_HUNGER;
            happiness -= 2;
            System.out.println(name + " is hungry!");

        } else if (hunger >= MIN_HUNGER) {
            System.out.println("Your dog is full!");
            energy--;
        }
    }
}
