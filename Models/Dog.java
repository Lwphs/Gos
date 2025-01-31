package Models;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private int energyLevel;
    private int hungerLevel;
    private static final int MAX_ENERGY_LEVEL = 10;
    private static final int MAX_HUNGER_LEVEL = 10;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.energyLevel = MAX_ENERGY_LEVEL;
        this.hungerLevel = MAX_HUNGER_LEVEL;
    }

    public void bark() {
        System.out.println(name + ": Woof woof!" + "\n What the dog doin?");
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
