package nl.novi.jp.methods.junior;

/**
 * Deze klasse bevat al de methode negativeNumberChecker. Beantwoord voor jezelf wat deze methode doet.
 * <p>
 * Roep de methode een paar keer aan om zijn gedrag in de praktijk te zien.
 */

public class JuniorThree {
    public static void main(String[] args) {
        negativeNumberChecker(1);
        negativeNumberChecker(0);
        negativeNumberChecker(-1);
        negativeNumberChecker(4);
//        negativeNumberChecker(47399572578);
    }

    public static void negativeNumberChecker(int number) {
        if (number > 0) {
            System.out.println(number + " is een positief getal.");
        } else {
            System.out.println(number + " is een negatief getal.");
        }
    }
}
