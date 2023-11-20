import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Alice", "123 Main St", "555-0100", "alice@example.com", "freshman"));
        persons.add(new Student("Bob", "456 High St", "555-0101", "bob@example.com", "sophomore"));
        persons.add(new Faculty("Dr. Smith", "789 Park Ave", "555-0102", "smith@example.com", "Math", 5000, "01-01-2020", "9am-5pm", "senior"));
        persons.add(new Faculty("Dr. Jones", "321 Oak St", "555-0103", "jones@example.com", "Science", 5500, "02-01-2020", "10am-6pm", "junior"));
        persons.add(new Staff("Mr. White", "654 Elm St", "555-0104", "white@example.com", "Admin", 3000, "03-01-2020", "Secretary"));
        persons.add(new Staff("Mrs. Green", "987 Maple St", "555-0105", "green@example.com", "Maintenance", 2500, "04-01-2020", "Custodian"));

        for (Person p : persons) {
            System.out.println(p);
        }

        List<Person> employees = filterEmployees(persons);
        System.out.println("Employees:");
        for (Person e : employees) {
            System.out.println(e);
        }
    }

    public static List<Person> filterEmployees(List<Person> persons) {
        List<Person> employees = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof Employee) {
                employees.add(p);
            }
        }
        return employees;
    }
}
