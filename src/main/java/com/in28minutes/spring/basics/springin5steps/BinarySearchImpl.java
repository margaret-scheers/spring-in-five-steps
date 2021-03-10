package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm quickSortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        // sorting logic test change
        int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
        System.out.println(quickSortAlgorithm);
        // search
        return 3;
    }
}
