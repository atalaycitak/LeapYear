import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Your word is a palindrome!");
        } else {
            System.out.println("Your word is not a palindrome!");
        }
    }

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public String LongestPalindrome(ArrayList<String> Allwords) {
        String longestPalindrome = null;
        int longestLength = 0;
        for(String word : Allwords){
            if(isPalindrome(word) && word.length() > longestLength){
                longestLength = word.length();
                longestPalindrome = word;
            }
        }
        return longestPalindrome;
    }
}