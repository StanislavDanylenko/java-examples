package stanislav.danylenko.examples.patterns.creational.factory.simple.components.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.simple.components.SomeRepository;

@Slf4j
public class SomeRepositoryFirstImpl implements SomeRepository {

    private final String config;

    public SomeRepositoryFirstImpl(String config) {
        this.config = config;
    }

    @Override
    public void print() {
        log.info("First impl - " + config);
    }

}
