package stanislav.danylenko.examples.patterns.structural.adapter.obj;

public class Processor {

    public boolean process(StringValueObject stringValueObject) {
        return stringValueObject.getStringValue().length() > 5;
    }

}
