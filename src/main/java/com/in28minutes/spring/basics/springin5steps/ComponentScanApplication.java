package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class ComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(ComponentScanApplication.class, args);

        ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

    }

}
