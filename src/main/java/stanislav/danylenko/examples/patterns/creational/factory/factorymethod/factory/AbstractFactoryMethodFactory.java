package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.FactoryMethodRepository;

public abstract class AbstractFactoryMethodFactory {

    public abstract FactoryMethodRepository createRepository();

}
