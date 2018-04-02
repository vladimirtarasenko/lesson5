package by.Itacademy.OOP_in_Java;

public class Square extends Figure {
   private int a;

    Square(int input) {
        a = input;
    }
    @Override
    void getArea() {
        int square = a * a;
        System.out.println("Square area is " + square);
    }
}
