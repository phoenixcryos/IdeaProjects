public abstract class Employee extends Person {
    private final String department;
    private final double monthlySalary;
    private final String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Employee{" + super.toString() + ", department='" + department +
                "', monthlySalary=" + monthlySalary + ", dateHired='" + dateHired + "'}";
    }
}
