package Exercise2;

import java.util.Scanner;

public class AnagramChecker {

    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
        a = a.replace("\\s", "").toLowerCase();
        b = b.replace("\\s", "").toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] countsA = countLetters(a);
        int[] countsB = countLetters(b);

        for (int i = 0; i < 26; i++) {
            if (countsA[i] != countsB[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Helper method to count how many times each letter (a-z) appears .
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                counts[Character.toLowerCase(c) - 'a']++;
            }
        }
        return counts;
    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {
        int[] counts = countLetters(s);
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                System.out.println((char) ('a' + i) + ": " + counts[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get two strings from the user
        System.out.print(" Enter the first string: ");
        String word1 = scanner.nextLine();
        System.out.print(" Enter the second string: ");
        String word2 = scanner.nextLine();
        // TODO: Process the strings here (ignore spaces , case)
        System.out.println(" Are they anagrams ? " + isAnagram(word1, word2));
        printLetterCounts(word1);
    }

}
