package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Quick")
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
