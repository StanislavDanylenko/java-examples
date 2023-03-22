package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.adapter.Processor;
import stanislav.danylenko.examples.patterns.structural.adapter.StringValueObject;
import stanislav.danylenko.examples.patterns.structural.adapter.impl.IntObjectAdapterClass;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.IntObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.StringObject;
import stanislav.danylenko.examples.patterns.structural.adapter.impl.IntObjectAdapterObject;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor();

        StringValueObject stringObject = new StringObject("asdasdsad");
        IntObject intObject = new IntObject(5);

        processor.process(stringObject);
//        processor.process(intObject.getIntValue());

        // object adapter
        StringValueObject intObjectAdapterObject = new IntObjectAdapterObject(intObject);
        processor.process(intObjectAdapterObject);

        // class adapter
        StringValueObject intObject1 = new IntObjectAdapterClass(intObject);
        processor.process(intObject1);
    }

}
