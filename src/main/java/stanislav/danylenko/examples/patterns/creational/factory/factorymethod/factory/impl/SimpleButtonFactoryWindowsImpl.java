package stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.impl.SimpleButtonLinuxImpl;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;

public class SimpleButtonFactoryWindowsImpl implements SimpleButtonFactory {

    @Override
    public SimpleButton createButton() {
        return new SimpleButtonLinuxImpl("Windows");
    }

}
