package org.example;

import org.example.Person;
import org.example.PersonComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> Persons = new ArrayList<>();
        Persons.add(new Person("Gaius", "Iulius Caesar Augustus Germanicus Caligula ", 45));
        Persons.add(new Person("Claudius", "Ptolemy", 30));
        Persons.add(new Person("Julius", "Gaius Caesar ", 50));
        Persons.add(new Person("Lucius", "Lucius Domitius Ahenobarbus Nero", 16));
        Persons.add(new Person("Marcus", "Aurelius Antoninus", 17));


        Collections.sort(Persons, new PersonComparator());
        for (Person Person : Persons) {

            System.out.println(Person);


        }


    }

}
