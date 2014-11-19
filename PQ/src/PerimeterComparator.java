
import java.util.*;

public class PerimeterComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Shape) o1).perimeter() > ((Shape) o2).perimeter()) {
            return 1;
        } else if (((Shape) o1).perimeter() == ((Shape) o2).perimeter()) {
            return 0;
        } else {
            return -1;
        }
    }

}