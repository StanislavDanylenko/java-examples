package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.FactoryMethodRepository;

public interface AbstractFactoryMethodFactory {

    public abstract FactoryMethodRepository createRepository();

}
