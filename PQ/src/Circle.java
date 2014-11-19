
public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
       return Math.PI*radius*radius;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "area= " 
                + String.format("%.2f",area() ) 
                + ",perimeter= "+ String.format("%.2f",perimeter() )
                + '}';
    }
    
    
}