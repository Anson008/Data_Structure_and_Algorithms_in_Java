package Chapter06;

import Chapter03.CircularlyLinkedList;

public class CircularQueue<E> implements ICircularQueue<E> {
    private CircularlyLinkedList<E> list = new CircularlyLinkedList<>();
    public CircularQueue() {}
    public int size() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public void enqueue(E element) { list.addLast(element); }
    public E first() { return list.first(); }
    public E dequeue() { return list.removeFirst();}
    public void rotate() { list.rotate(); }
}
