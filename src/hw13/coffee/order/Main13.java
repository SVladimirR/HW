package hw13.coffee.order;

public class Main13 {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Bob");
        orderBoard.add("Ted");
        orderBoard.add("Ivan");
        orderBoard.add("Stas");

        orderBoard.draw();

        orderBoard.deliver();

        orderBoard.deliver(3);

        orderBoard.draw();

    }
}
