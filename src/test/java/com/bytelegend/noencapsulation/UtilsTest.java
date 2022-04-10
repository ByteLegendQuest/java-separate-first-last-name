package com.bytelegend.noencapsulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UtilsTest {
    private List<Person> testPersons =
            Arrays.asList(
                    createPerson("Alice", "Smith", 30),
                    createPerson("Bob", "Brown", 40),
                    createPerson("Charlie", "Taylor", 55));

    private Person createPerson(String firstName, String lastName, int age) {
        Person p = new Person();
        p.firstName = firstName;
        p.lastName = lastName;
        p.age = age;

        return p;
    }

    @Test
    public void testFilterPeopleWithNameLongerThan() {
        Assertions.assertEquals(
                Arrays.asList("Alice Smith", "Charlie Taylor"),
                Utils.filterPeopleWithNameLongerThan1(testPersons, 10).stream()
                        .map(p -> p.firstName + " " + p.lastName)
                        .collect(java.util.stream.Collectors.toList()));
        Assertions.assertEquals(
                Arrays.asList("Alice Smith", "Charlie Taylor"),
                Utils.filterPeopleWithNameLongerThan2(testPersons, 10).stream()
                        .map(p -> p.firstName + " " + p.lastName)
                        .collect(java.util.stream.Collectors.toList()));
    }

    @Test
    public void testFilterPeopleWithNameStartingWith() {
        Assertions.assertEquals(
                Arrays.asList("Alice Smith"),
                Utils.filterPeopleWithNameStartingWith1(testPersons, "A").stream()
                        .map(p -> p.firstName + " " + p.lastName)
                        .collect(java.util.stream.Collectors.toList()));
        Assertions.assertEquals(
                Arrays.asList("Alice Smith"),
                Utils.filterPeopleWithNameStartingWith2(testPersons, "A").stream()
                        .map(p -> p.firstName + " " + p.lastName)
                        .collect(java.util.stream.Collectors.toList()));
    }

    @Test
    public void testGetNameToPersonMap() {
        Assertions.assertEquals(
                new HashSet<>(Arrays.asList("Alice Smith", "Bob Brown", "Charlie Taylor")),
                Utils.getNameToPersonMap1(testPersons).keySet());
        Assertions.assertEquals(
                new HashSet<>(Arrays.asList("Alice Smith", "Bob Brown", "Charlie Taylor")),
                Utils.getNameToPersonMap2(testPersons).keySet());
    }
}
