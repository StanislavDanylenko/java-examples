package stanislav.danylenko.examples.patterns.behavior.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.examples.patterns.behavior.iterator.MyIterator;

public class MyIteratorImpl implements MyIterator {

    private int currentPosition;
    private final List<String> values = new ArrayList<>();

    public MyIteratorImpl(List<String> values) {
        this.values.addAll(values);
    }

    @Override
    public boolean hasMore() {
        return currentPosition < values.size();
    }

    @Override
    public String getNext() {
        return values.get(currentPosition++);
    }
}
