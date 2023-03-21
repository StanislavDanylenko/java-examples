package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryRepository;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryUtil;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.repository.AbstractFactoryRepositoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.util.AbstractFactoryUtilFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.ComponentFactory;

public class ComponentFactoryFirstImpl implements ComponentFactory {

    @Override
    public AbstractFactoryRepository createRepository() {
        return new AbstractFactoryRepositoryFirstImpl("First");
    }

    @Override
    public AbstractFactoryUtil createUtil() {
        return new AbstractFactoryUtilFirstImpl("First");
    }

}
