package stanislav.danylenko.examples.patterns.creational.builder;

import java.util.Date;

public final class BuilderExample {

    private final String name;
    private final Integer age;
    private final Date date;

    private BuilderExample(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.date = builder.date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getDate() {
        return date;
    }

    public static final class Builder {
        private String name;
        private Integer age;
        private Date date;

        private Builder() {}

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withDate(Date date) {
            this.date = date;
            return this;
        }

        public BuilderExample build() {
            return new BuilderExample(this);
        }
    }

}
