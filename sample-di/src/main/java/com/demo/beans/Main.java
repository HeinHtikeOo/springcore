package com.demo.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        Person person=context.getBean(Person.class);

        System.out.println("Name"+person.getName());
    }
}
