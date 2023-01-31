import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Amanzhol", "Respublika", "Proger", 180000.0);
        Employee employee2 = new Employee("Qanat", "Jeksenbayev", "unemployed", 0);
        Student student3 = new Student("Duisenbi", "Maratov", 2.53);
        Student student4 = new Student("Boris", "Johnsynbayev", 4.0);

        List<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student3);
        people.add(student4);

        Collections.sort(people);
        printData(people);
    }
}