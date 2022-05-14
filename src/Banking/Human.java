package Banking;

public class Human {
    private final String firstName;
    private final String lastName;

    private final int age;

    //constructor
    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //getter's
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
