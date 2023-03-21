package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.impl;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.SimpleButton;

@Slf4j
public class SimpleButtonFirstImpl implements SimpleButton {

    private final String type;

    public SimpleButtonFirstImpl(String type) {
        this.type = type;
    }

    @Override
    public void press() {
        log.info("First impl - " + type);
    }

}
