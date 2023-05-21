package hw7;

public class SubGen {


    public static Subscriber[] generateSubArray() {
        Subscriber[] array = new Subscriber[3];
        array[0] = new Subscriber(1, "Must1", "Bob", "Dnepr", "+380999999999",
                "789", -122.2, 50, 0, 33.3);
        array[1] = new Subscriber(2, "Uber2", "Tom", "Kiev", "+380888888888",
                "456", 88.8, 222, 22, 55.5);
        array[2] = new Subscriber(3, "Labmert3", "Lary", "Kiev", "+3807777777777",
                "123", 22.2, 111, 88, 11.1);

        return array;
    }
}
