package by.Itacademy.OOP_in_Java;

public class Rectangle extends Figure {
    private int a, b;

    Rectangle(int length, int width) {
        a = length;
        b = width;
    }
    @Override
    void getArea() {
        int square = a * b;
        System.out.println("Rectangle area is " + square);
    }
}
