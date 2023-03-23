package stanislav.danylenko.examples.patterns.behavior.iterator.my.impl;

import java.util.ArrayList;
import java.util.List;

import stanislav.danylenko.examples.patterns.behavior.iterator.my.MyIterator;

public class IterableEntityImplIterator implements MyIterator {

    private int currentPosition;
    private final IterableEntityImpl entity;
    private final List<String> values;

    public IterableEntityImplIterator(IterableEntityImpl entity) {
        this.entity = entity;
        this.values = entity.getValues();
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
