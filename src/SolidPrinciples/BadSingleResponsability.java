package SolidPrinciples;

//S - Single Responsability
public class BadSingleResponsability {

    //Person
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    //Customer
    private Integer customerId;
    private String customerName;
    private String customerEmail;

    public BadSingleResponsability(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
