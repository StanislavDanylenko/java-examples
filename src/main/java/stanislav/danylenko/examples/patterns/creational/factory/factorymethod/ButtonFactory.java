package stanislav.danylenko.examples.patterns.creational.factory.factorymethod;

import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.components.SimpleButton;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.SimpleButtonFactory;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl.SimpleButtonFactoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.factorymethod.factory.impl.SimpleButtonFactorySecondImpl;

public final class ButtonFactory {

    public static SimpleButtonFactory getFactory(String type) {
        if ("First".equals(type)) {
            return new SimpleButtonFactoryFirstImpl();
        } else {
            return new SimpleButtonFactorySecondImpl();
        }
    }

    public static SimpleButton getRepository(String type) {
        SimpleButtonFactory factory = getFactory(type);
        return factory.createButton();
    }

}
