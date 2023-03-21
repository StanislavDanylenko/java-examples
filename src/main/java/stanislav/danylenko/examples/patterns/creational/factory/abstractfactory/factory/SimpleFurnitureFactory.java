package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;

public interface SimpleFurnitureFactory {

    Table createTable();
    Chair createChair();

}
