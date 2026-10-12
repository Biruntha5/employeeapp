package com.aids;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.aids.EmployeeService.*(..))")
    public void logMessage(JoinPoint joinPoint) {

        String method = joinPoint.getSignature().getName();

        if (method.equals("addEmployee")) {
            System.out.println("Logging: Adding employee");
        } else if (method.equals("displayEmployee")) {
            System.out.println("Logging: Displaying employee");
        } else if (method.equals("calculateSalary")) {
            System.out.println("Logging: Calculating salary");
        }
    }
}