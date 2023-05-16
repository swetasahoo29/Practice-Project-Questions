package com.example.testcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImmutableTest {

    @Test
    public void testImmutableStudent() {
        // Arrange
        String name = "Sweta";
        int age = 5;

        // Act
        Student student = new Student(name, age);
        //An instance of the Student class is created using the name and age variables.

        // The Assertions.assertEquals statements verify that the getName() method of the student object returns the same name ("Sweta") and the getAge() method returns the same age (5) as the variables used for creating the student object.
        Assertions.assertEquals(name, student.getName());
        Assertions.assertEquals(age, student.getAge());

        // Attempt to modify the student's name
        name = "New Name";
        student.getName();

        // Attempt to modify the student's age
        age = 10;
        student.getAge();

        // Assert that the student's name and age remain unchanged
        Assertions.assertEquals("Sweta", student.getName());
        Assertions.assertEquals(5, student.getAge());
        //So by using Junit5, the final Assertions.assertEquals statements verify that the getName() method still returns "Sweta" and the getAge() method still returns 5, indicating that the Student object is indeed immutable.
    }
}
