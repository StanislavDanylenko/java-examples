package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.table.TablePlainImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.chair.ChairPlainImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

public class SimpleFurnitureFactoryPlainImpl implements SimpleFurnitureFactory {

    @Override
    public Table createTable() {
        return new TablePlainImpl("Plain");
    }

    @Override
    public Chair createChair() {
        return new ChairPlainImpl("Plain");
    }

}
