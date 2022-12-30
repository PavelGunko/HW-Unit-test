package org.example;

import org.example.Person;

import java.util.Comparator;

public class PersonComparator<PersonComparator> implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        String[] subSurname1 = o1.getSurname().split(" ");
        int quantity1 = subSurname1.length;
        String[] subSurname2 = o2.getSurname().split(" ");
        int quantity2 = subSurname2.length;
        if (quantity1 == quantity2) {
            return o2.getAge() - o1.getAge();

        }

        return quantity2 - quantity1;
    }
}