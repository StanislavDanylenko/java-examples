package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl.SimpleFurnitureFactoryFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl.SimpleFurnitureFactorySecondImpl;

public final class FurnitureFactory {

    public static SimpleFurnitureFactory getFactory(String type) {
        if ("First".equals(type)) {
            return new SimpleFurnitureFactoryFirstImpl();
        } else {
            return new SimpleFurnitureFactorySecondImpl();
        }
    }

    public static Table getRepository(String type) {
        SimpleFurnitureFactory factory = getFactory(type);
        return factory.createTable();
    }

    public static Chair getUtil(String type) {
        SimpleFurnitureFactory factory = getFactory(type);
        return factory.createChair();
    }

}
