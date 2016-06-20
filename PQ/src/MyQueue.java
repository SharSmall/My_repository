
import java.util.*;

public class MyQueue<T> {
    ArrayList<T> list;
    MyQueue(){
        list=new ArrayList<T>();
    }
    void enqueue(T t){
        list.add(t);
    }
    void dequeue(){
        list.remove(0);
    }
    
}