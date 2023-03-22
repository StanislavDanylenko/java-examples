package stanislav.danylenko.examples.patterns.structural.facade.serialization.components;

public class JsonDeserializer {

    public Integer deserializeToInt(String value) {
        return Integer.parseInt(value);
    }

    public Double deserializeToDouble(String value) {
        return Double.parseDouble(value);
    }

    public Long deserializeToLong(String value) {
        return Long.parseLong(value);
    }

}
