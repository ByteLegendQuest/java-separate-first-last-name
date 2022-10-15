package com.bytelegend.encapsulation;

/**
 * `Person` class has a `name` field, now we need to split it into `firstName` and `lastName`
 * fields. The old code using `name` field needs to be changed to `firstName + " " + lastName`. For
 * the code without encapsulation, we need to change all the places that use `name` to `firstName +
 * " " + lastName`. For the code with encapsulation, we only need to change the implementation of
 * `getName()` method - nothing else needs to be changed.
 */
public class Person {
    public String lastName;
    public String firstName;
    /** The age of the person. */
    private int age;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return firstName + "_" + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
