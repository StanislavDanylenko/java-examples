package stanislav.danylenko.examples.patterns.creational.builder;

import java.util.Date;

public final class BuilderExample {

    private final String name;
    private final Integer age;
    private final Date date;

    private BuilderExample(String name, Integer age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
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
            return new BuilderExample(this.name, this.age, this.date);
        }
    }

}
