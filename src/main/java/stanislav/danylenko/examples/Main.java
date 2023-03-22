package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.SerializationFacade;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.components.JsonDeserializer;
import stanislav.danylenko.examples.patterns.structural.facade.serialization.components.ToXmlSerializer;

@Slf4j
public class Main {

    public static void main(String[] args) {
        SerializationFacade serializationFacade = new SerializationFacade(
                new JsonDeserializer(), new ToXmlSerializer()
        );
        Integer integerVal = serializationFacade.fromXml("1", Integer.class);
        Double doubleVal = serializationFacade.fromXml("2.0", Double.class);
        Long longVal = serializationFacade.fromJson("55555555555555555555555L", Long.class);

    }

}
