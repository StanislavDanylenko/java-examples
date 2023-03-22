package stanislav.danylenko.examples.patterns.structural.adapter.obj.impl;

import stanislav.danylenko.examples.patterns.structural.adapter.obj.IntObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.StringObject;

public class IntObjectAdapter extends StringObject {

    private final IntObject intObject;

    public IntObjectAdapter(IntObject intObject) {
        this.intObject = intObject;
    }

    @Override
    public String getStringValue() {
        return intObject.toString();
    }
}
