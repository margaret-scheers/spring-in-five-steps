package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringIn5StepsApplicationScope {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationScope.class, args);

        PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info("person {}", personDao);
        LOGGER.info("person {}", personDao2);

        LOGGER.info("jdbc {}", personDao.getJdbcConnection());
        LOGGER.info("jdbc {}", personDao2.getJdbcConnection());
    }

}
