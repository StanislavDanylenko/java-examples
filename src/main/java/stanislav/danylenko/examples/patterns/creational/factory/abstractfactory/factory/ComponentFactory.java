package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryRepository;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryUtil;

public interface ComponentFactory {

    AbstractFactoryRepository createRepository();
    AbstractFactoryUtil createUtil();

}
