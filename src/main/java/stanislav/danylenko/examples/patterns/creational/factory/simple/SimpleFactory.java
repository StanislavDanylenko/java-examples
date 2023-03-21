package stanislav.danylenko.examples.patterns.creational.factory.simple;

import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SomeRepository;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SomeRepositoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SomeRepositorySecondImpl;

public final class SimpleFactory {

    private SimpleFactory() {}

    public static SomeRepository createRepository(String type) {
        if ("First".equals(type)) {
            return new SomeRepositoryFirstImpl(type);
        } else {
            return new SomeRepositorySecondImpl(type);
        }
    }

}
