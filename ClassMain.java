package home004;

/* Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

public class ClassMain {
    public static void main(String[] args) {
        ClassQueue queue = new ClassQueue();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("wow");
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
