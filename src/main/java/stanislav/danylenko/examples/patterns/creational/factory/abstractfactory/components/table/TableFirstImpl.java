package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.table;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;

@Slf4j
public class TableFirstImpl implements Table {

    private final String type;

    public TableFirstImpl(String type) {
        this.type = type;
    }

    @Override
    public void putOn() {
        log.info("First impl - " + type);
    }

}
