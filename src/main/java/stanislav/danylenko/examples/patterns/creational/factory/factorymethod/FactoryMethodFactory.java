package stanislav.danylenko.examples.patterns.creational.factory.factorymethod;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.FactoryMethodRepository;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.AbstractFactoryMethodFactory;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl.FactoryMethodFirstFactory;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl.FactoryMethodSecondFactory;

public final class FactoryMethodFactory {

    public static AbstractFactoryMethodFactory getFactory(String type) {
        if ("First".equals(type)) {
            return new FactoryMethodFirstFactory();
        } else {
            return new FactoryMethodSecondFactory();
        }
    }

    public static FactoryMethodRepository getRepository(String type) {
        AbstractFactoryMethodFactory factory = getFactory(type);
        return factory.createRepository();
    }

}
