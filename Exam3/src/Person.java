public class Person {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Getters and setters
    // ...

    @Override
    public String toString() {
        return "Person{name='" + name + "', address='" + address +
                "', phoneNumber='" + phoneNumber + "', emailAddress='" + emailAddress + "'}";
    }
}
