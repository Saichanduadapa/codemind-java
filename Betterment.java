import java.util.*;
abstract class Shape{
    double area;
    Scanner sc=new Scanner(System.in);
    abstract void getInput();
    abstract void calculateArea();
    void printArea(){
        System.out.println("Area is : "+area);
    }
}
class Circle extends Shape{
    int radius;// instance variable
    static final double PI=3.14;// static or class variable
    void getInput(){
        radius=sc.nextInt();
    }
    void calculateArea(){
        area=PI*radius*radius;
    }
}
class Rectangle {
    int length,breadth;
    void grtInput(){
        length=sc.nextInt();
        breadth=sc.nextInt();
    }
    void calculateArea(){
        area=length*breadth;
    }
}
class Square{
    int side;
    void getInput(){
        side=sc.nextInt();
    }
    void calculateArea(){
        area=side*side;
    }
}
public class Betterment{
    public static void main(String[] args) {
        // objects of circle class
        Circle c=new Circle();
        c.getRadius();
        c.calculateArea();
        c.printArea();
        Rectangle r=new Rectangle();
        r.getLengthandBreadth();
        r.calculateArea();
        r.printArea();
        Square s=new Square();
        s.getSideLength();
        s.calculateArea();
        s.printArea();
        }
}
