package by.Itacademy.OOP_in_Java;

public class Triangle extends Figure {
    private int a, h;

    Triangle(int triangleHeight, int triangleBase) {
        a = triangleBase;
        h = triangleHeight;
    }
    @Override
    void getArea() {
        double square = a * h / 2;
        System.out.println("Triangle square is " + square);
    }
}
