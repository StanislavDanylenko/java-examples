package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.table;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;

@Slf4j
public class TableSecondImpl implements Table {

    private final String type;

    public TableSecondImpl(String type) {
        this.type = type;
    }

    @Override
    public void putOn() {
        log.info("Second impl - " + type);
    }

}
