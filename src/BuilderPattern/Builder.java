package BuilderPattern;

import SolidPrinciples.Person;

public class Builder {

    private Integer id;
    private String name;
    private String email;
    private Integer age;

    //configure methods
    public Builder withId(Integer id) {
        this.id = id;
        return this;
    }

    public Builder withName(String name) {
        this.name = name;
        return this;
    }

    public Builder withEmail(String email) {
        this.email = email;
        return this;
    }

    public Builder withAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(id, name, email, age);
    }

}
