package stanislav.danylenko.examples;

import lombok.extern.slf4j.Slf4j;
import stanislav.danylenko.examples.patterns.structural.decorator.TextWriter;
import stanislav.danylenko.examples.patterns.structural.decorator.TextWriterDecorator;
import stanislav.danylenko.examples.patterns.structural.decorator.decimpl.TagTextWriterDecorator;
import stanislav.danylenko.examples.patterns.structural.decorator.decimpl.UpperCaseTextWriterDecorator;
import stanislav.danylenko.examples.patterns.structural.decorator.impl.SimpleTextWriter;

@Slf4j
public class Main {

    public static void main(String[] args) {
        TextWriter textWriter = new SimpleTextWriter();
        TextWriterDecorator upperCaseDecorator = new UpperCaseTextWriterDecorator(textWriter);
        TextWriterDecorator tagTextWriterDecorator = new TagTextWriterDecorator(upperCaseDecorator);

        String hello = tagTextWriterDecorator.write("hello");
        log.info("End");
    }

}
