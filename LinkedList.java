
import java.util.Iterator;

public class LinkedList<T> implements List<T> {
    private int size = 0;
    private Node<T> first = null;
    private Node<T> last = null;

        private static class Node<T> {
            T item;
            Node<T> next;
            Node<T> prev;

            Node(Node<T> prev, T element, Node<T> next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }

    public LinkedList (int size, Node<T> first, Node<T> last) {
        this.size = size;
        this.first = first;
        this.last = last;
    }

// метод вставки в начало
    public void addFirst (T t) {
        first = new Node<>(null, T ,1);
        size++;
    }
// метод вставки в конец
    public void addLast(T t) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, t, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

// получение размера списка
    @Override
    public int size() {
        return size;
    }

// получение элемента по индексу
    public int getLinkedListIndex (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public Iterator<T> iterator() {
        return new NewIterator<T>(size);
    }



}
