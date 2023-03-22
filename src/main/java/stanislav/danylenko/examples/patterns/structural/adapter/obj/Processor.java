package stanislav.danylenko.examples.patterns.structural.adapter.obj;

public class Processor {

    public boolean process(String value) {
        return value.length() > 5;
    }

}
