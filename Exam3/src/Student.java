public class Student extends Person {
    // additional field
    String status;

    // constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    // getters and setters
    // ...

    // toString method
    // ...
}
