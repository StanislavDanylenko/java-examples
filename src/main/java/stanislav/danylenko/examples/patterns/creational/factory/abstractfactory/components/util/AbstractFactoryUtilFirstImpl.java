package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.util;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryRepository;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.AbstractFactoryUtil;

@Slf4j
public class AbstractFactoryUtilFirstImpl implements AbstractFactoryUtil {

    private final String type;

    public AbstractFactoryUtilFirstImpl(String type) {
        this.type = type;
    }

    @Override
    public void configure() {
        log.info("First impl - " + type);
    }

}
