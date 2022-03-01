import static java.lang.Math.PI;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled){
        this.radius = radius;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = PI * radius * radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = PI * 2 * radius;
        return perimeter;
    }

    public double getDiameter(){
        double diameter = 2 * radius;
        return diameter;
    }

    public void printCircle(){

    }

}
