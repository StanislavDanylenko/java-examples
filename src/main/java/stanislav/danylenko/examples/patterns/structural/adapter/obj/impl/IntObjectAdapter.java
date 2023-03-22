package stanislav.danylenko.examples.patterns.structural.adapter.obj.impl;

import stanislav.danylenko.examples.patterns.structural.adapter.obj.StringValueObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.impl.objs.IntObject;

public class IntObjectAdapter implements StringValueObject {

    private final IntObject intObject;

    public IntObjectAdapter(IntObject intObject) {
        this.intObject = intObject;
    }

    @Override
    public String getStringValue() {
        return intObject.getIntValue().toString();
    }
}
