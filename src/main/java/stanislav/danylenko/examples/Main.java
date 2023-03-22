package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.impl.objs.IntObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.Processor;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.impl.objs.StringObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.impl.IntObjectAdapter;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor();

        StringObject stringObject = new StringObject("asdasdsad");
        IntObject intObject = new IntObject(5);

        processor.process(stringObject);
//        processor.process(intObject.getIntValue());
        IntObjectAdapter intObjectAdapter = new IntObjectAdapter(intObject);
        processor.process(intObjectAdapter);
    }

}
