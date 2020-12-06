public class Triangle extends GeometricObject{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    Triangle(){}
    Triangle(double newSide1, double newSide2, double newSide3){
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
    }

    public double getSide1(){
        return side1;
    }
    public void setSide1(double newSide1){
        side1 = newSide1;
    }

    public double getSide2(){
        return side2;
    }
    public void setSide2(double newSide2){
        side2 = newSide2;
    }

    public double getSide3(){
        return side3;
    }
    public void setSide3(double newSide3){
        side3 = newSide3;
    }

    public double getArea(){
        double p = (side1 + side2 + side3)/2;
        return Math.sqrt(p*(p - side1)*(p - side2)*(p - side3));
    }
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
