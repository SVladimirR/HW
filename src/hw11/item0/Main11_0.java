package hw11.item0;

public class Main11_0 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        double[] figures = new double[3];
        figures[0] = circle.squareFigure(30);
        figures[1] = triangle.squareFigure(30);
        figures[2] = square.squareFigure(30);

        System.out.println("Square figures: " + calculateSum(figures));
    }

    private static double calculateSum(double[] figures) {
        double sum = 0;
        for (double s : figures) {
            sum += s;
        }
        return sum;
    }
}
