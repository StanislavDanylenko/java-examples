package stanislav.danylenko.examples.patterns.behavior.iterator.my.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.examples.patterns.behavior.iterator.my.MyEntity;
import stanislav.danylenko.examples.patterns.behavior.iterator.my.MyIterator;

public class IterableEntityImpl implements MyEntity {

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
        return new IterableEntityImplIterator(this);
    }

    public List<String> getValues() {
        return new ArrayList<>(values);
    }
}
