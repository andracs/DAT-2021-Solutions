package thinkjava.chapter5;

import java.util.Random;
import java.util.Scanner;

// Fra JulieVedel, tak :) https://github.com/JulieVedel/Chapter5-Conditionals/blob/master/src/com/company/Exercise2.java
public class Chapter5Exercise2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        Random Random = new Random();
        int randomNumber = Random.nextInt(101);

        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        int yourNumber = Scanner.nextInt();

        System.out.println("Your guess is: " + yourNumber);
        higherLower(randomNumber, yourNumber);

        System.out.println("Have another guess!");
        int yourSecondNumber = Scanner.nextInt();
        higherLower(randomNumber, yourSecondNumber);

        System.out.println("This is your last guess!");
        int yourThirdNumber = Scanner.nextInt();
        higherLower(randomNumber, yourThirdNumber);

        System.out.println("The number I was thinking of was: " + randomNumber);
        System.out.println("You were off by: " + Math.abs(yourThirdNumber - randomNumber));
    }

    public static void higherLower(int x, int y) {
        if (x > y) {
            System.out.println("The answer is higher!");
        } else if (x < y) {
            System.out.println("The answer is lower!");
        } else if (x == y) {
            System.out.println("You guessed the number!");
            System.exit(0);
        }
    }
}