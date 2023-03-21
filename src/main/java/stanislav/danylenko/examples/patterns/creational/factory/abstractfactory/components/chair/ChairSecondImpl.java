package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.chair;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;

@Slf4j
public class ChairSecondImpl implements Chair {

    private final String type;

    public ChairSecondImpl(String type) {
        this.type = type;
    }

    @Override
    public void sitOn() {
        log.info("Second impl - " + type);
    }

}
