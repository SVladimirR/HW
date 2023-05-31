package hw11.item1;

abstract class Participant {
    private final String name;

    public Participant(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void run();

    public abstract void jump();

    public abstract boolean overcome(Obstacle obstacle);

}
