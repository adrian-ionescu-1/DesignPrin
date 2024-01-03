package SolidPrinciples;

public class Student extends Person {
    private Integer grade;

    public Student(Integer id, String name, String email, Integer age, Integer grade) {
        super(id, name, email, age);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}
