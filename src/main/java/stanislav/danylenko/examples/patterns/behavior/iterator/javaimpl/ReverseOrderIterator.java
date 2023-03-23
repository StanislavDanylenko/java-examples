package stanislav.danylenko.examples.patterns.behavior.iterator.javaimpl;

import java.util.Iterator;

public class ReverseOrderIterator<T> implements Iterator<T> {

    private final ReverseOrderList<T> list;
    private int currentIndex;

    public ReverseOrderIterator(ReverseOrderList<T> list) {
        this.list = list;
        this.currentIndex = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        return list.get(currentIndex--);
    }
}
