public class Faculty extends Employee {
    private final String officeHours;
    private final String rank; // junior or senior

    public Faculty(String name, String address, String phoneNumber, String emailAddress,
                   String department, double monthlySalary, String dateHired,
                   String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Faculty{" + super.toString() + ", officeHours='" + officeHours +
                "', rank='" + rank + "'}";
    }
}
