package stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SomeRepository;

@Slf4j
public class SomeRepositorySecondImpl implements SomeRepository {

    private final String config;

    public SomeRepositorySecondImpl(String config) {
        this.config = config;
    }

    @Override
    public void print() {
        log.info("Second impl - " + config);
    }

}
