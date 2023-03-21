package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.impl;

import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Chair;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.table.TableLuxuryImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.chair.ChairLuxuryImpl;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.factory.SimpleFurnitureFactory;

public class SimpleFurnitureFactoryLuxuryImpl implements SimpleFurnitureFactory {

    @Override
    public Table createTable() {
        return new TableLuxuryImpl("Luxury");
    }

    @Override
    public Chair createChair() {
        return new ChairLuxuryImpl("Luxury");
    }

}
