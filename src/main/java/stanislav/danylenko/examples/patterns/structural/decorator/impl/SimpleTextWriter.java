package stanislav.danylenko.examples.patterns.structural.decorator.impl;

import stanislav.danylenko.examples.patterns.structural.decorator.TextWriter;

public class SimpleTextWriter implements TextWriter {
    @Override
    public String write(String text) {
        return text;
    }
}
