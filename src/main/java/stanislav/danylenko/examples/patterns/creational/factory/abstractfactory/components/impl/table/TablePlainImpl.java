package stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.impl.table;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.creational.factory.abstractfactory.components.Table;

@Slf4j
public class TablePlainImpl implements Table {

    private final String type;

    public TablePlainImpl(String type) {
        this.type = type;
    }

    @Override
    public void putOn() {
        log.info("Plain impl - " + type);
    }

}
