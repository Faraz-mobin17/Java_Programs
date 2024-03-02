package Foundation.Strings;

public class Solution {
    public static boolean halvesAreAlike(String s) {
        if (s.length() % 2 != 0 || s.length() < 2)
            return false;
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);
        int firstHalfVowelCount = 0, secondHalfVowelCount = 0;
        for (int i = 0; i < firstHalf.length(); i += 1) {
            if (checkVowel(firstHalf.charAt(i))) {
                firstHalfVowelCount++;
            }
            if (checkVowel(secondHalf.charAt(i))) {
                secondHalfVowelCount++;
            }
        }
        return firstHalfVowelCount == secondHalfVowelCount;
    }

    private static boolean checkVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        String s = "Uo";
        System.out.println("Ans: " + halvesAreAlike(s));
    }
}