
public class Test {
    public static void main(String[] args) {
        MyQueue<Shape> q1= new MyQueue<Shape>();
        q1.enqueue(new Circle(20));
        q1.enqueue(new Rectangle(20,30));
        q1.enqueue(new Triangle(3,2,4));
        System.out.println(q1.list);
        
        AreaPQ<Shape> q2= new AreaPQ<Shape>();
        q2.enqueue(new Circle(20));
        q2.enqueue(new Rectangle(20,30));
        q2.enqueue(new Triangle(3,2,4));
        System.out.println(q2.list);
        
        PerimeterPQ<Shape> q3= new PerimeterPQ<Shape>();
        q3.enqueue(new Circle(20));
        q3.enqueue(new Rectangle(20,30));
        q3.enqueue(new Triangle(3,2,4));
        System.out.println(q3.list);
    }
    
}