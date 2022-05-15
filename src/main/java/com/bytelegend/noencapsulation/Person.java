package com.bytelegend.noencapsulation;

/**
 * `Person` class has a `name` field, now we need to split it into `firstName` and `lastName`
 * fields. The old code using `name` field needs to be changed to `firstName + " " + lastName`. For
 * the code without encapsulation, we need to change all the places that use `name` to `firstName +
 * " " + lastName`. For the code with encapsulation, we only need to change the implementation of
 * `getName()` method - nothing else needs to be changed.
 */
public class Person {
    /** The name of the person. */
    public String name;
    /** The age of the person. */
    public int age;

    public String firstName;

    public String lastName;
}
