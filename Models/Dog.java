package Models;

public class Dog {
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
        this.hunger = MAX_HUNGER;
        this.voice = MAX_VOICE;
        this.happiness = MAX_HAPPINESS / 2;
    }

    public void bark() {
        System.out.println(name + ": Woof woof!" + "\n What the dog doin?");
        voice--;
        energy--;
    }

    public void eat() {
        System.out.println(name + " is eating good, he probably enjoys the meal.");
        energy++;
    }

    public void sleep() {
        System.out.println(name + " is profoundly sleeping.");
        energy = MAX_ENERGY;
        voice = MAX_VOICE;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }



}
