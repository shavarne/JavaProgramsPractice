import java.util.Scanner;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ArrayOfObjectsExample {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = new Person[3];

        // Populate the array with objects
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 22);

        // Get user input to search for a person by name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        // Search for the person in the array
        boolean found = false;
        for (Person person : people) {
            if (person != null && person.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Person found! Name: " + person.getName() + ", Age: " + person.getAge());
                found = true;
                break;
            }
        }

        // If not found, display a message
        if (!found) {
            System.out.println("Person with name '" + searchName + "' not found.");
        }
    }
}

