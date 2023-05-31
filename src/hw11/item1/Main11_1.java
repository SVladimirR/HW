package hw11.item1;

public class Main11_1 {
    public static void main(String[] args) {
        Participant[] participants = new Participant[3];
        participants[0] = new Human("Ben");
        participants[1] = new Cat("Myrka");
        participants[2] = new Robot("Robokop");

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Wall(2);
        obstacles[1] = new Track(200);
        for (Participant p : participants) {
            for (Obstacle o : obstacles) {
                if (!p.overcome(o)) {
                    break;
                }
            }
        }
    }
}
