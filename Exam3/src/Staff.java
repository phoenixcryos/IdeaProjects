public class Staff extends Employee {
    private final String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String department, double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Staff{" + super.toString() + ", title='" + title + "'}";
    }
}
