package SolidPrinciples;

import java.time.LocalDate;

public class Customer extends Person {

    private String order;

    private LocalDate registrationDate;

    public Customer(Integer id, String name, String email, Integer age, String orderExample, LocalDate registrationDate) {
        super(id, name, email, age);
        order = orderExample;
        this.registrationDate = registrationDate;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "order='" + order + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
