package hw6;

public class Main06 {

    public static void main(String[] args) {

        Cat cat = new Cat("Myrka");
        cat.run(100);
        Cat cat1 = new Cat("Vasy");
        cat1.run(250);
        Cat cat2 = new Cat("Kyzy");
        cat2.swim(10);
        Dog dog1 = new Dog("Warik");
        dog1.run(100);
        Dog dog2 = new Dog("Barsik");
        dog2.run(2500);
        Dog dog3 = new Dog("Bar");
        dog3.swim(9);

        System.out.println("Total cats " + Cat.quantity);
        System.out.println("Total dogs " + Dog.quantity);
        System.out.println("Total animals " + (Cat.quantity + Dog.quantity));


    }
}
