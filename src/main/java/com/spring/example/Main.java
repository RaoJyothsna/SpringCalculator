package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("com.spring.example");
        CalciClass calculator = (CalciClass) applicationContext.getBean("calciClass");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operation (add, sub,multiply,divide): ");
        String op = scanner.next();
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        System.out.println("Result: " + calculator.compute(op, x, y));
    }

}

