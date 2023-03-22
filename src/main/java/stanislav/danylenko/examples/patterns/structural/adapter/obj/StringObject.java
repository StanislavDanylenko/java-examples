package stanislav.danylenko.examples.patterns.structural.adapter.obj;

import stanislav.danylenko.examples.patterns.structural.adapter.StringValueObject;

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
