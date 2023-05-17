package hw6;

public class Dog extends Animals {
    private final String name;
    public static int quantity = 0;

    public Dog(String name) {
        this.name = name;
        quantity++;
    }

    @Override
    public void run(int parameter) {
        if (parameter > 500) {
            System.out.println("Dog " + name + " can't get over");
        } else {
            System.out.println("The dog " + name + " ran  " + parameter + " meter");
        }
    }

    @Override
    public void swim(int parameter) {

        if (parameter > 10) {
            System.out.println("Dog " + name + "can't get over");
        } else {
            System.out.println("The dog " + name + " swim  " + parameter + " meter");
        }
    }
}
