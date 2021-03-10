package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch1 + " " + binarySearch2);
        int result = binarySearch1.binarySearch(new int[] {1,5,3} , 3);
        System.out.println("result= " + result);
    }

}
