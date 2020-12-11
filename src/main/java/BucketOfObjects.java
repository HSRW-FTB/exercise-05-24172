public class BucketOfObjects {
    private GeometricObject[] items = new GeometricObject[10];
    private int index = -1;

    public BucketOfObjects() {}

    public void addObject(GeometricObject obj){
        index++;
        this.items[index] = obj;
    }

    public double getTotalArea(){
        double Area = 0;
        for(int i = 0; i <= index; i++) {
            Area = Area + items[i].getArea();
       }
       return Area;
    }
    
    public double getTotalPerimeter(){
        double Perimeter = 0;
        for(int i = 0; i <= index; i++){
            Perimeter = Perimeter + items[i].getPerimeter();
       }
       return Perimeter;
    }

    public String toString(){
        String allObjects = "";
        int i;
        for (i = 0 ; i <= this.index; i++){
            if (items[i].getClass().equals(Rectangle.class)) {
                allObjects += "Rectangle";
            }
            else if (items[i].getClass().equals(Circle.class))
                {allObjects += "Circle";
                }
            else if (items[i].getClass().equals(Triangle.class))
            {allObjects += "Triangle";
            }
            else
            {allObjects += "RegularPolygon";
            }
            allObjects += ", ";
        }
        allObjects = allObjects.substring(0, allObjects.length()-2);
        return allObjects;
    }
}
