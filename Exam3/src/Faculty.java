public class Faculty extends Employee {
    // additional fields
    String officeHours;
    String rank; // junior or senior

    // constructor
    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String department, double monthlySalary, String dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // getters and setters
    // ...

    // toString method
    // ...
}
