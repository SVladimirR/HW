package hw11.item1;

public abstract class Obstacle {
    private final int value;


    protected Obstacle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
