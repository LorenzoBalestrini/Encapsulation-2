package it.develhope.encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name:");
        person.setName(scanner.nextLine());

        System.out.println("Please enter the surname:");
        person.setSurname(scanner.nextLine());

        System.out.println("Please enter the height:");
        person.setHeight(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Please enter the age:");
        person.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.printf("Name: %s - Surname: %s - height: %f - Age: %d", person.getName(), person.getSurname(), person.getHeight(), person.getAge());


    }
}

