
import java.util.*;

public class AreaPQ<T> {

    ArrayList<T> list;

    AreaPQ() {
        list = new ArrayList<T>();
    }

    void enqueue(T t) {
        list.add(t);
        Collections.sort((List)list);
    }

    void dequeue() {
        list.remove(0);
    }

}