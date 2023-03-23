package stanislav.danylenko.examples.patterns.behavior.iterator.javaimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseOrderList<T> implements Iterable<T> {

    private final List<T> list = new ArrayList<>();

    public ReverseOrderList() {
    }

    public void add(T data) {
        list.add(data);
    }

    public int size() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseOrderIterator<>(this);
    }
}
