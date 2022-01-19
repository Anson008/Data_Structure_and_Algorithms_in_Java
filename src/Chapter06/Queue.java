package Chapter06;

public interface Queue<E> {
    int size();  // Return the number of elements in the queue.
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
}
