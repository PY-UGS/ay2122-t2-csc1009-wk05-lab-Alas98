public class Triangle extends Shape{
    public Triangle(){
    }

    public Triangle(double dim1, double dim2){
        super.setDim1(dim1);
        super.setDim2(dim2);
    }
    public double area(){
        return 0.5 * super.getDim1() * super.getDim2();
    }
}
