import java.io.Serializable;

public class Student implements Serializable {
    String firstName;
    String lastName;
    int age;
    int studentNumber;

    public Student(String firstName, String lastName, int age, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentNumber = studentNumber;
    }
}
