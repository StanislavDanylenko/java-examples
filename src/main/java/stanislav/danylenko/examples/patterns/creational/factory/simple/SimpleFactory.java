package stanislav.danylenko.examples.patterns.creational.factory.simple;

import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SimpleRepository;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SimpleRepositoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SimpleRepositorySecondImpl;

public final class SimpleFactory {

    private SimpleFactory() {}

    public static SimpleRepository createRepository(String type) {
        if ("First".equals(type)) {
            return new SimpleRepositoryFirstImpl(type);
        } else {
            return new SimpleRepositorySecondImpl(type);
        }
    }

}
