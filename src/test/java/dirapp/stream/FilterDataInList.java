package dirapp.stream;

import java.util.*;
import java.util.stream.*;

class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

public class FilterDataInList {
    public static void main(String[] args) {
        // Membuat List<Person>
        List<Person> persons = Arrays.asList(
            new Person(123, "John Doe", 30, "123 Street"),
            new Person(124, "Jane Smith", 25, "456 Avenue"),
            new Person(125, "Emily Johnson", 35, "789 Boulevard")
        );

        // Mencari Person dengan Id = 123
        int searchId = 123;
        Optional<Person> person = persons.stream()
                                         .filter(p -> p.getId() == searchId)
                                         .findFirst();

        // Menampilkan hasil
        if (person.isPresent()) {
            System.out.println("Person found: " + person.get());
        } else {
            System.out.println("Person with Id " + searchId + " not found.");
        }
    }
}
