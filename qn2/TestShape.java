public class TestShape {
    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5,5);
        Ellipse e = new Ellipse(7,7);
        Square s = new Square(6,6);
        Shape figref;

        figref = r;
        System.out.println("Inside area for rectangle. " + figref.area());
        figref = t;
        System.out.println("Inside area for triangle. " + figref.area());
        figref = c;
        System.out.printf("Inside area for circle. %.1f \n" , figref.area());
        figref = e;
        System.out.printf("Inside area for ellipse. %.2f \n " , figref.area());
        figref = s;
        System.out.println("Inside area for square. " + figref.area());
    }

}
