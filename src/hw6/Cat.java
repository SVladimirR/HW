package hw6;

public class Cat extends Animals {
    private final String name;
    public static int quantity = 0;

    public Cat(String name) {
        this.name = name;
        quantity++;
    }

    @Override
    public void run(int parameter) {
        if (parameter > 200) {
            System.out.println("Cat " + name + " can't get over " + parameter + " meters");
        } else {
            System.out.println("The cat " + name + "ran " + parameter + " meters");
        }
    }

    @Override
    public void swim(int parameter) {

        System.out.println("Cats can't swim");
    }


}
