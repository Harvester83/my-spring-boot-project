package com.my_spring_boot_project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

//import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

  private static int[] numbers;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);


    //		System.out.println("Hello World!");


    //    int[] numbers = {1, 2, 3, 4, 5};
    //
    //    for (int number : numbers) {
    //      System.out.println(number);
    //    }

    ArrayList<String> names = new ArrayList<>();

    names.add("Jek");
    names.add("Sam");
    names.add("Asc");

    for (String name : names) {
      System.out.println(name);
    }

  }

}
