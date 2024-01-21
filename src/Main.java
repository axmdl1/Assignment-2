import Project.Employee;
import Project.Person;
import Project.Student;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void PrintData (Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + "tg");
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Employee("Akhmedali", "Duisembaiuly", "Software Engeneer", 500000));
        peopleList.add(new Student("Ringo", "Starr", 2.5));
        peopleList.add(new Student("Paul", "McCartney", 3.0));
        peopleList.add(new Employee("George", "Harrison", "Developer", 50000.00));

        Collections.sort(peopleList);

        PrintData(peopleList);
    }

}



