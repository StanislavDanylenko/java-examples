package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryRepository;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryUtil;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.repository.AbstractFactoryRepositorySecondImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.util.AbstractFactoryUtilSecondImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.ComponentFactory;

public class ComponentFactorySecondImpl implements ComponentFactory {

    @Override
    public AbstractFactoryRepository createRepository() {
        return new AbstractFactoryRepositorySecondImpl("Second");
    }

    @Override
    public AbstractFactoryUtil createUtil() {
        return new AbstractFactoryUtilSecondImpl("Second");
    }

}
