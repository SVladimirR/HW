package hw11.item0;

public class Triangle implements GeometricFigures {
    @Override
    public double squareFigure(double parameter) {
        return Math.sqrt(3) * Math.pow(parameter, 2) / 4;
    }
}
