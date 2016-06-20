
import java.util.*;


public class PerimeterPQ<T> {
     ArrayList<T> list;

    PerimeterPQ() {
        list = new ArrayList<T>();
    }

    void enqueue(T t) {
        list.add(t);
        Collections.sort((List)list, new PerimeterComparator());
    }

    void dequeue() {
        list.remove(0);
    }

}