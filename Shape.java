package Task02;

public class Shape
{
    public void area(){
        System.out.println("Calculating the Area.");
    }

    public static void main(String[] args)
    {
        Shape c = new Circle();
        Shape r = new Rectangle();
        Shape t = new Triangle();

        c.area();
        r.area();
        t.area();
    }
}

class Circle extends Shape{
    @Override
    public void area() {
        double rad = 2;
        double area = Math.PI*rad*rad;
        System.out.println("Area Of Circle: " + area);
    }
}

class Rectangle extends Shape{
    @Override
    public void area() {
        double l=9.5;
        double w=6.5;
        double area = l*w;
        System.out.println("Area Of Rectangle: " + area);
    }
}

class Triangle extends Shape{
    @Override
    public void area() {
        double b=5.6;
        double h=4.95;
        double area = 0.5*b*h;
        System.out.println("Area Of Triangle: " + area);
    }
}