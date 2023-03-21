package stanislav.danylenko.examples.patterns.creational.factory.factorymethod;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl.SimpleButtonFactoryWindowsImpl;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl.SimpleButtonFactoryLinuxImpl;

public final class ButtonFactory {

    public static SimpleButtonFactory getFactory(String type) {
        if ("First".equals(type)) {
            return new SimpleButtonFactoryWindowsImpl();
        } else {
            return new SimpleButtonFactoryLinuxImpl();
        }
    }

    public static SimpleButton getRepository(String type) {
        SimpleButtonFactory factory = getFactory(type);
        return factory.createButton();
    }

}
