package Inheritance_in_java;

public class MainClass {
    public static void main(String args[])
    {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.setValues(10 ,10);
        tri.setValues(10 ,10);

        System.out.println("Area of Rectangle = " + rec.Area());
        System.out.println("Area of Triangle = " + tri.Area());


    }
}
