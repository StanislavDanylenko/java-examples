package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.IntObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.Processor;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.StringObject;
import stanislav.danylenko.examples.patterns.structural.adapter.obj.impl.IntObjectAdapter;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.SerializationFacade;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.components.JsonDeserializer;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.components.ToXmlSerializer;
import stanislav.danylenko.examples.patterns.structural.proxy.SensitiveService;
import stanislav.danylenko.examples.patterns.structural.proxy.components.AuthUser;
import stanislav.danylenko.examples.patterns.structural.proxy.components.Role;
import stanislav.danylenko.examples.patterns.structural.proxy.impl.SensitiveServiceImpl;
import stanislav.danylenko.examples.patterns.structural.proxy.impl.SensitiveServiceProxy;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Processor processor = new Processor();

        StringObject stringObject = new StringObject("asdasdsad");
        IntObject intObject = new IntObject(5);

        processor.process(stringObject.getStringValue());
//        processor.process(intObject.getIntValue());
        IntObjectAdapter intObjectAdapter = new IntObjectAdapter(intObject);
        processor.process(intObjectAdapter.getStringValue());
    }

}
