package com.example.testcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    @Test
    public void testSortedStream() {
        // Arrange
        List<Integer> list = Arrays.asList(5, -10, 7, -18, 23);
        //The list variable is initialized with a list of integers: [5, -10, 7, -18, 23].
        List<Integer> expected = Arrays.asList(23, 7, 5, -10, -18);
        //The expected variable is initialized with the expected sorted result: [23, 7, 5, -10, -18].

        //The result variable is assigned the result of the stream operations performed on the list. The stream is sorted in reverse order using sorted(Comparator.reverseOrder()) and the sorted elements are collected into a new list using collect(Collectors.toList()).
        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Assert
        Assertions.assertEquals(expected, result);//verifies that the result list is equal to the expected list
    }
}
