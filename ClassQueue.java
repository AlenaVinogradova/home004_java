package home004;

import java.util.Iterator;
import java.util.LinkedList;

/* Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

public class ClassQueue {
    private LinkedList<String> ourList = new LinkedList<>();

    void enqueue(String elem) {
        ourList.add(elem);
    }

    String dequeue() {
        Iterator<String> collect = ourList.iterator();       
        if (collect.hasNext()) {           
            return ourList.remove(0);
        }
        return "null";
    }

    String first() {
        return ourList.get(0);
    }
}
