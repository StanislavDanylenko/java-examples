package stanislav.danylenko.examples.patterns.structural.adapter.obj.impl.objs;

import stanislav.danylenko.examples.patterns.structural.adapter.obj.StringValueObject;

public class StringObject implements StringValueObject {

    private final String value;

    public StringObject(String value) {
        this.value = value;
    }

    @Override
    public String getStringValue() {
        return value;
    }

}
