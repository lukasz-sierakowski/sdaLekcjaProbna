package org.sda.lesson;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Podaj tekst: ");

        String text = reader.nextLine();    // Ala ma kota a kot ma Alę (7)
        String[] words = text.split(" "); //[0] = Ale, [1] = ma ....
        System.out.println("Ilość słów w tekście wynosi: " + words.length);
    }
}
