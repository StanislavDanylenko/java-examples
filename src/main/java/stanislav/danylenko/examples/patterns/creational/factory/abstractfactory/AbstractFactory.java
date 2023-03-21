package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryRepository;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryUtil;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.ComponentFactory;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl.ComponentFactoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl.ComponentFactorySecondImpl;

public final class AbstractFactory {

    public static ComponentFactory getFactory(String type) {
        if ("First".equals(type)) {
            return new ComponentFactoryFirstImpl();
        } else {
            return new ComponentFactorySecondImpl();
        }
    }

    public static AbstractFactoryRepository getRepository(String type) {
        ComponentFactory factory = getFactory(type);
        return factory.createRepository();
    }

    public static AbstractFactoryUtil getUtil(String type) {
        ComponentFactory factory = getFactory(type);
        return factory.createUtil();
    }

}
