public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(){
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, Boolean filled){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        double area = width * height;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * (width + height);
        return perimeter;
    }

}
