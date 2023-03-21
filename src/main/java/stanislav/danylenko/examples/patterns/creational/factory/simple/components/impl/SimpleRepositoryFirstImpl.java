package stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SimpleRepository;

@Slf4j
public class SimpleRepositoryFirstImpl implements SimpleRepository {

    private final String type;

    public SimpleRepositoryFirstImpl(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        log.info("First impl - " + type);
    }

}
