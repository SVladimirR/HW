package hw11.item0;

public class Circle implements GeometricFigures {
    @Override
    public double squareFigure(double diameter) {

        return Math.PI * Math.pow(diameter, 2) / 4;
    }
}
