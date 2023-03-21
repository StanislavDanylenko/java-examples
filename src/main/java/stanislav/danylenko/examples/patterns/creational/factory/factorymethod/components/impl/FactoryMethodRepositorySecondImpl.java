package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.FactoryMethodRepository;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SimpleRepository;

@Slf4j
public class FactoryMethodRepositorySecondImpl implements FactoryMethodRepository {

    private final String type;

    public FactoryMethodRepositorySecondImpl(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        log.info("Second impl - " + type);
    }

}
