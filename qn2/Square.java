public class Square extends Shape {
    public Square(){
    }

    public Square(double dim1, double dim2){
        super.setDim1(dim1);
        super.setDim2(dim2);
    }

    public double area(){
        return super.getDim1() * super.getDim2();
    }
}
