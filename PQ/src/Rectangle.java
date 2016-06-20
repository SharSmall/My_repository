
public class Rectangle extends Shape{
    double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width*height;
    }

    @Override
    double perimeter() {
       return (width+height)*2;
    }
     @Override
    public String toString() {
        return "Rectangle{" + "area= " 
                + String.format("%.2f",area() ) 
                + ",perimeter= "+ String.format("%.2f",perimeter() )
                + '}';
    }
    
}