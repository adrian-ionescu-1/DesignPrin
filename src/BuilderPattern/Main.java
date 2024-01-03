package BuilderPattern;

import SolidPrinciples.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(1, "Person1", "person1@mail.com", 20);

        Person person2 = new Person();
        person2.setId(2);
        person2.setName("Person2");
        person2.setEmail("person2@mail.com");
        person2.setAge(30);

        Person person3 = new Builder()
                .withId(3)
                .withName("Person3")
                .build();

        Person person4 = new Builder()
                .withEmail("person3@mail.com")
                .build();
    }
}
