package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl.SimpleFurnitureFactoryPlainImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl.SimpleFurnitureFactoryLuxuryImpl;

public final class FurnitureFactory {

    public static SimpleFurnitureFactory getFactory(String type) {
        if ("First".equals(type)) {
            return new SimpleFurnitureFactoryPlainImpl();
        } else {
            return new SimpleFurnitureFactoryLuxuryImpl();
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
