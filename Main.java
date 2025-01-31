import Models.Dog;

public class Main {

    static Dog dawg = new Dog("Khidir Karawita", "Pitbull", 3, 50);
    static Dog dawg2;

    public static void main(String[] args) {
        dawg2.setName("Khalid Kashmiri");
        dawg2.setAge(12);
        dawg2.setWeight(10);
        dawg2.setBreed("Yorkshire");

        menu();
    }

    private static void menu() {
    }
}
