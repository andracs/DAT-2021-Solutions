/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 21/09/2021
 */
package dk.zealand;

// Sepå https://books.trinket.io/thinkjava2/chapter6.html
public class Chapter6Exercise6 {

    // Imagine you are given your set of tiles as a string, like "adoost", and you are given another string to test, like "ost".
    // Write a method called canSpell that
    // takes two strings and checks whether the set of tiles can spell the word.
    // You might have more than one tile with the same letter, but you can use each tile only once.

    public static void main(String[] args) {
        System.out.println(canSpell2("hapsadoost", "ostehaaaps"));
    }

    public static boolean canSpell(String letters, String word) {
        boolean spell = true;
        for (int i = 0; i < word.length(); i++) {   // løkke kører igennem hele ordet
            char letter = word.charAt(i);           // letter repræsenterer det aktuelle bogstav
            if (!letters.contains(String.valueOf(letter))) {
                spell = false;
                break;
            } else {
                letters = letters.replaceFirst(String.valueOf(word.charAt(i)), "");
            }
        }
        return spell;
    }

    public static boolean canSpell2(String bogstavsBunken, String ordSomViBygger) {

        // Pseudokode
        // Afgør hvor mange bogstaver du vil finde (ord.length)
        // Gennemløb alle bogstaver i ordet (loop) en efter en
        // Gennemløb bunken og led efter det givne bogstav
        // Hvis fundet, slet fra bunken
        // Og marker, at nu er der et mindre bogstav der skal findes
        // Hvis alle bogstaver er fundet (dvs at der er 0 tilbage) så return true ellers return false

        // Gennemløber ordSomViBygger
        // Der skal findes så mange bogstaver
        int antalBogstaverIOrdet = ordSomViBygger.length();
        for (int i = 0; i < ordSomViBygger.length(); i++) {
            // System.out.println(ordSomViBygger.charAt(i));
            // tjekke om bogstavet finde i bunken
            char bogstavSomViErIGangMed = ordSomViBygger.charAt(i);
            for (int j = 0; j < bogstavsBunken.length(); j++) {
                if (bogstavSomViErIGangMed == bogstavsBunken.charAt(j)) {
                    // fjerne den fra bunken
                    System.out.println(bogstavsBunken + " før sletning");
                    bogstavsBunken = bogstavsBunken.substring(0,j)+""+bogstavsBunken.substring(j+1);
                    System.out.println(bogstavsBunken + " efter sletning");
                    antalBogstaverIOrdet = antalBogstaverIOrdet - 1;
                    System.out.println("Så mange bogstaver mangler at blive fundet endnu:  " + antalBogstaverIOrdet);
                }
            }
        }
        return antalBogstaverIOrdet == 0;
        }
}
