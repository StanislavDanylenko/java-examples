package stanislav.danylenko.examples.patterns.creational.factory.simple;

import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SomeRepository;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SomeRepositoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl.SomeRepositorySecondImpl;

public final class SimpleFactory {

    private SimpleFactory() {}

    public static SomeRepository getRepository(String param) {
        if ("First".equals(param)) {
            return new SomeRepositoryFirstImpl(param);
        } else {
            return new SomeRepositorySecondImpl(param);
        }
    }

}
