package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.impl.SimpleButtonFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;

public class SimpleButtonFactorySecondImpl implements SimpleButtonFactory {

    @Override
    public SimpleButton createButton() {
        return new SimpleButtonFirstImpl("First");
    }
}
