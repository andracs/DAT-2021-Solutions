package dk.zealand;

public class Chapter6Exercise4 {

    // Fra bogen https://books.trinket.io/thinkjava2/chapter6.html
    // Kapitel 6 ex 4
    // Kapitel 6 ex 6

    public static void main(String[] args) {
        String ord = "adddempt";
        if (isAbecedarian(ord)) {
            System.out.println("Ordet " + ord + "er i abc-rækkefølge");
        }
        else {
            System.out.println("Ordet " + ord + " er ikke i abc-rækkefølge");
        }
    }

    // Write a method called isAbecedarian that
    // takes a String and
    // returns a boolean indicating whether the word is abecedarian.
    public static boolean isAbecedarian(String ord) {
        for (int i = 1; i < ord.length(); i++) {
            if (ord.charAt(i)<ord.charAt(i-1)) return false;
        }
        return true;
    }

}
