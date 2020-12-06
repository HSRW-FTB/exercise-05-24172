public class RegularPolygon extends GeometricObject{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){}
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }
    public RegularPolygon(int newN, double newSide, double newX, double newY){
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public int getN(){
        return n;
    }
    public void setN(int newN){
        n = newN;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double newSide){
        side = newSide;
    }

    public double getX(){
        return x;
    }
    public void setX(double newX){
        x = newX;
    }

    public double getY(){
        return y;
    }
    public void setY(double newY){
        y = newY;
    }

    /*public void setFilled(int f){
        if (f > 0){
            super.setFilled(true);
        }
        else {
            super.setFilled(false);
        }
    }
    public void changeColor(String color){
        super.setColor(color);
    }*/

    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (n * (Math.pow(side,2))/(4 * Math.tan(Math.PI/n)));
    }

    public String toString(){
        return "RegularPolygon: number of sides = " + n + " side length = " + side;
    }
}
