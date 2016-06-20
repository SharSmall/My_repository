
public class Triangle extends Shape{
    double x1,x2,x3;

    public Triangle(double x1, double x2, double x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    @Override
    double area() {
        double p=(x1+x2+x3)/2;
        return Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
    }

    @Override
    double perimeter() {
        return x1+x2+x3;
    }
     @Override
    public String toString() {
        return "Triangle{" + "area= " 
                + String.format("%.2f",area() ) 
                + ",perimeter= "+ String.format("%.2f",perimeter() )
                + '}';
    }
    
}