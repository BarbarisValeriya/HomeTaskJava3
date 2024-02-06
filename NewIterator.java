
import java.util.Iterator;
public class NewIterator<E> implements Iterator<E> {
    private E[] values;
    private int index;

    public NewIterator(E[] values) {
        this.values = values;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
