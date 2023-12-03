package com.myhomeworks.hwspring;

import com.myhomeworks.hwspring.model.Bean;
import com.myhomeworks.hwspring.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class HwSpringApplication {

    public static void main(String[] args) {

       ApplicationContext applicationContext = SpringApplication.run(HwSpringApplication.class, args);
        Person personFirst = (Person) applicationContext.getBean("person");
        Person personSecond = (Person) applicationContext.getBean("person");
        System.out.println(personSecond);
        Person personThird = (Person) applicationContext.getBean("person");
        Person personForth = (Person) applicationContext.getBean("person");
        System.out.println(applicationContext.getBean(Person.class));
        System.out.println(applicationContext.getBean(Bean.class).getName());
    }

}
