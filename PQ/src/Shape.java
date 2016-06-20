
abstract public class Shape implements Comparable{
    abstract double area();
    abstract double perimeter();

    @Override
    public int compareTo(Object o) {
        if(area()> ((Shape)o).area())
            return 1;
        else if(area()==((Shape)o).area())
            return 0;
        else
            return -1;
    }
    
    
}