package Chapter06;

public interface IQueue<E> {
    int size();  // Return the number of elements in the queue.
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
}
