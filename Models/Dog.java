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

    public void bark() {
        System.out.println(name + ": Woof woof!" + "\n What the dog doin?");
        voice--;
        energy--;
    }

    public void eat() {
        System.out.print("What will you give the dog to eat? ");
        String foodName = input.nextLine();
        System.out.println(name + " is eating" + foodName + ", he probably enjoys the meal.");
        hunger++;
        happiness++;
    }

    public void sleep() {
        int sleepTime = input.nextInt();

        System.out.print("How many hours do you want your dog to sleep? ");
        sleepTime = input.nextInt();
        if (sleepTime + energy > MAX_ENERGY) {
            energy = MAX_ENERGY;
            voice = MAX_VOICE;
        } else {
            energy += sleepTime;
            voice += sleepTime;
        }

        for (int i = 0; i <  sleepTime; i++) {
            System.out.println(name + " is profoundly sleeping...");
        }

    }

    public void walkTheDog() {
        System.out.println("You walked the dog.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", energy=" + energy +
                ", hunger=" + hunger +
                ", voice=" + voice +
                ", happiness=" + happiness +
                '}';
    }
}
