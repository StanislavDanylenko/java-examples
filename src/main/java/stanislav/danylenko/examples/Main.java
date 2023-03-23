package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.behavior.iterator.my.MyEntity;
import stanislav.danylenko.examples.patterns.behavior.iterator.my.MyIterator;
import stanislav.danylenko.examples.patterns.behavior.iterator.my.impl.IterableEntityImpl;

@Slf4j
public class Main {

    public static void main(String[] args) {
        MyEntity entity = new IterableEntityImpl();
        entity.addValue("Hello");
        entity.addValue("World");

        MyIterator iterator = entity.createIterator();
        while (iterator.hasMore()) {
            log.info("Val: {}", iterator.getNext());
        }
    }

}
