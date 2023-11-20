public class Staff extends Employee {
    // additional field
    String title;

    // constructor
    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String department, double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    // getters and setters
    // ...

    // toString method
    // ...
}
