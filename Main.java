
package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void isDoubloon (String text) {
        String textDublicate = text.toLowerCase();
        for (int i = 0; i <= text.length() - 1; i++) {
            int counter = 0;
            for (int x = 0; x <= text.length() - 1; x++) {
                if (text.toLowerCase().charAt(i) == textDublicate.toLowerCase().charAt(x)) {
                    counter++;
                }
                if (counter == 3) {
                    System.out.println("The word is not a doubloon!");
                    testIfNumber();
                }
            }
            if (counter <= 1) {
                System.out.println("The word is not a doubloon!");
                testIfNumber();
            }
        }
        System.out.println("Yaaaay! The word is a doubloon!");
        testIfNumber();
    }

    public static void testIfNumber(){
        boolean isDoubloon = true;

        String[] tal = new String[10];
        tal [0] = "0";
        tal [1] = "1";
        tal [2] = "2";
        tal [3] = "3";
        tal [4] = "4";
        tal [5] = "5";
        tal [6] = "6";
        tal [7] = "7";
        tal [8] = "8";
        tal [9] = "9";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type exit, if you want to close the program. \nType a word, to see if it's a doubloon.\n");
        String text = scanner.next();
        if (text.toLowerCase().equals("exit")){
            System.exit(0);
        }
        for (int i = 0; i < tal.length; i++) {
            if (text.contains(tal[i])) {
                isDoubloon = false;
                break;
            }
        }
        if (!isDoubloon){
            System.out.println("There is a number in your word, try again!");
            testIfNumber();
        }
        isDoubloon(text);

    }
    public static void main(String[] args) {
        testIfNumber();
    }
}