package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.FactoryMethodRepository;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.impl.FactoryMethodRepositoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.AbstractFactoryMethodFactory;

public class FactoryMethodSecondFactory extends AbstractFactoryMethodFactory {

    @Override
    public FactoryMethodRepository createRepository() {
        return new FactoryMethodRepositoryFirstImpl("First");
    }
}
