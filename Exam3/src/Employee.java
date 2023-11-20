public abstract class Employee extends Person {
    // fields
    String department;
    double monthlySalary;
    String dateHired;

    // constructor
    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    // getters and setters
    // ...

    // toString method
    // ...
}
