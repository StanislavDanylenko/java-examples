package stanislav.danylenko.examples.patterns.behavior.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.examples.patterns.behavior.iterator.IterableEntity;
import stanislav.danylenko.examples.patterns.behavior.iterator.MyIterator;

public class IterableEntityImpl implements IterableEntity {

    private final List<String> values = new ArrayList<>();

    @Override
    public void addValue(String value) {
        values.add(value);
    }

    @Override
    public void removeValue(String value) {
        values.remove(value);
    }

    @Override
    public MyIterator createIterator() {
        return new MyIteratorImpl(values);
    }
}
