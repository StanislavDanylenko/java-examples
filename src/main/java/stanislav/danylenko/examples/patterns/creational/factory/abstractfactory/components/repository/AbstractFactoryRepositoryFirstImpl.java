package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.repository;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryRepository;

@Slf4j
public class AbstractFactoryRepositoryFirstImpl implements AbstractFactoryRepository {

    private final String type;

    public AbstractFactoryRepositoryFirstImpl(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        log.info("First impl - " + type);
    }

}
