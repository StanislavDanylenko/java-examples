package stanislav.danylenko.examples.patterns.behavior.iterator;

public interface IterableEntity {
    MyIterator createIterator();

    void addValue(String value);
    void removeValue(String value);
}
