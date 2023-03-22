package stanislav.danylenko.examples.patterns.structural.decorator.impl.dec;

import stanislav.danylenko.examples.patterns.structural.decorator.TextWriter;
import stanislav.danylenko.examples.patterns.structural.decorator.TextWriterDecorator;

public class UpperCaseTextWriterDecorator extends TextWriterDecorator {

    public UpperCaseTextWriterDecorator(TextWriter textWriter) {
        super(textWriter);
    }

    @Override
    public String write(String text) {
        return super.write(text).toUpperCase();
    }
}
