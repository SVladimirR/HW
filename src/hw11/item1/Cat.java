package hw11.item1;

public class Cat extends Participant {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " run");

    }

    @Override
    public void jump() {
        System.out.println(getName() + " jump");

    }
    @Override
    public boolean overcome(Obstacle obstacle) {
        if (obstacle instanceof Track) {
            run();
            Track track = (Track) obstacle;
            if (track.getValue() <= 200) {
                System.out.println("Participant " + getName() + " passed the track");
                return true;
            } else {
                System.out.println("Participant " + getName() + " didn't pass the track");
                return false;
            }
        } else if (obstacle instanceof Wall) {
            jump();
            Wall wall = (Wall) obstacle;
            if (wall.getValue() <= 1) {
                System.out.println("Participant " + getName() + " overcame the wall");
                return true;
            } else {
                System.out.println("Participant " + getName() + " didn't get over the wall");
                return false;
            }
        }
        return false;
    }
}
