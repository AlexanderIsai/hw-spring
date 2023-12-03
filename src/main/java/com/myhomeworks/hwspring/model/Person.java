package com.myhomeworks.hwspring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Person {


    public Person(){
        System.out.println("Person exist");
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
