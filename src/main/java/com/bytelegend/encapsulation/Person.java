package com.bytelegend.encapsulation;

/**
 * `Person` class has a `name` field, now we need to split it into `firstName` and `lastName`
 * fields. The old code using `name` field needs to be changed to `firstName + " " + lastName`. For
 * the code without encapsulation, we need to change all the places that use `name` to `firstName +
 * " " + lastName`. For the code with encapsulation, we only need to change the implementation of
 * `getName()` method - nothing else needs to be changed.
 */
public class Person {
    /**
     * The name of the person.
     */
    private String name;
    /**
     * The age of the person.
     */
    private int age;
    /**
     * The firstName of the person.
     */
    private String firstName;
    /**
     * The lastName of the person.
     */
    private String lastName;

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
