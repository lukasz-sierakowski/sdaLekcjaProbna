package org.sda.lesson;


import java.util.Scanner;

public class HelloWorldWithName {
    public static void main(String[] args) {
        Scanner consoleReader = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = consoleReader.nextLine();

        System.out.print("Podaj nazwisko: ");
        String surname = consoleReader.nextLine();

        //System.out.println("Hello " + name + surname);
        System.out.println(String.format("Hello %s %s", name, surname));
    }
}
