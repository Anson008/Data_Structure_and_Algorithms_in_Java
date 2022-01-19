package Chapter03;

public class SinglyLinkedList<E> {
    // ---------- Nested Node class --------
    private static class Node<E> {
        private E element;  // reference to the element stored at this node
        private Node<E> next;  // reference to the subsequent node in the list
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }
    // --------- End of nested Node class --------

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList() {}

    // Access methods
    public int size() {return size;}
    public boolean isEmpty() {return size==0;}
    public E first() {
        // returns (but does not remove) the first element
        if (isEmpty())
            return null;
        return head.getElement();
    }
    public E last() {
        // returns (but does not remove) the last element
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    // Update methods
    public void addFirst(E e){
        head = new Node<>(e, head);  // Create and link a new node to the previous head
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }
}
