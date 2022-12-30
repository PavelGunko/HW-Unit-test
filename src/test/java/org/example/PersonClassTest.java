package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonClassTest {
    PersonComparator personComparator = new PersonComparator();
    List<Person> Persons = new ArrayList<>();

    @BeforeEach
    public void setup() {

        Persons.add(new Person("Gaius", "Iulius Caesar Augustus Germanicus Caligula ", 45));
        Persons.add(new Person("Claudius", "Ptolemy", 30));
        Persons.add(new Person("Julius", "Gaiushg", 50));
        Persons.add(new Person("Lucius", "Lucius hjg", 16));
        Persons.add(new Person("Marcus", "Aurelius Antoninus", 17));
        Persons.add(new Person("Marcus", "Aurelius Antoninus", 17));
        Persons.add(new Person("Marcus", "Aurelius Antoninus", 27));
    }

    @Test
    public void test1() {
        //проверка равных объектов
        assertEquals(0, personComparator.compare(Persons.get(4), Persons.get(5)));
        // проверим разницу возраста(изменив возраст)
        assertEquals(10, personComparator.compare(Persons.get(4), Persons.get(6)));
    }


    @Test
    public void test2() {
        // test one < two
        assertEquals(1, personComparator.compare(Persons.get(2), Persons.get(3)));
    }

    @Test
    public void test3() {
        // test two < one
        assertEquals(-1, personComparator.compare(Persons.get(5), Persons.get(2)));

    }
}
