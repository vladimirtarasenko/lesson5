package by.Itacademy.OOP_in_Java;

public class Circle extends Figure {
    int a;
    Circle(int radius){
        a=radius;
    }
    @Override
    void getArea() {
        double square=Math.PI*a*a/4;
        System.out.println("Circle area is "+square);
    }
}
