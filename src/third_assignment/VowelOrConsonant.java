package third_assignment;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        String character, vowels = "aeiou", consonants = "bcdfghjklmnpqrstvwyxz";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        character = input.next();
        if (character.length() > 1) {
            System.out.println("input one character only.");
            System.exit(0);
        }
        char c = character.charAt(0);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            if (vowels.contains(character.toLowerCase())) {
                System.out.println(character + " is a vowel letter");
            } else {
                System.out.println(character + " is a consonant letter");
            }
        } else {
            System.out.println("Invalid alphabet character.");
        }

    }
}
