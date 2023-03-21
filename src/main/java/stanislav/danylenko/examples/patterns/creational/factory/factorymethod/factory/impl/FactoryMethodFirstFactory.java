package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.FactoryMethodRepository;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.impl.FactoryMethodRepositorySecondImpl;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.AbstractFactoryMethodFactory;

public class FactoryMethodFirstFactory implements AbstractFactoryMethodFactory {

    @Override
    public FactoryMethodRepository createRepository() {
        return new FactoryMethodRepositorySecondImpl("Second");
    }

}
