package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.table.TableFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.chair.ChairFirstImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

public class SimpleFurnitureFactoryFirstImpl implements SimpleFurnitureFactory {

    @Override
    public Table createTable() {
        return new TableFirstImpl("First");
    }

    @Override
    public Chair createChair() {
        return new ChairFirstImpl("First");
    }

}
