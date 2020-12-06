public class BucketOfObjects {
    private GeometricObject[] items;

    public BucketOfObjects() {}

    public void addObject(GeometricObject obj){
        for(int i = 0; i < items.length; i++)
        {
            items[i] = obj;
        }
    }

    public double getTotalArea(){
        double Area = 0;
        for(int i = 0; i < items.length; i++) {
            return Area = Area + items[i].getArea();
       }
       return 0;
    }
    
    public double getTotalPerimeter(){
        double Perimeter = 0;
        for(int i = 0; i < items.length; i++){
            return Perimeter = Perimeter + items[i].getPerimeter();
       }
       return 0;
    }

    public String toString(){
        return "";
    }
}