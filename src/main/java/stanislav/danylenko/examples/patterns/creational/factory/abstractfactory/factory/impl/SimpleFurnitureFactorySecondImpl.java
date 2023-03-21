package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.table.TableSecondImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.chair.ChairSecondImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

public class SimpleFurnitureFactorySecondImpl implements SimpleFurnitureFactory {

    @Override
    public Table createTable() {
        return new TableSecondImpl("Second");
    }

    @Override
    public Chair createChair() {
        return new ChairSecondImpl("Second");
    }

}
