public class Student extends Person {
    private final String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", status='" + status + "'}";
    }
}
