package com.aids;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Appconfig.class);

        EmployeeService employee =
                context.getBean(EmployeeService.class);

        employee.addEmployee();
        employee.displayEmployee();
        employee.calculateSalary();

        context.close();
    }
}