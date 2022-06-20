import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj znaki do sprawdzenia");
        String checkWord= scan.nextLine();

        if (isPalindrome(checkWord)) {
            System.out.println("is palindrome");
        }else{
            System.out.println("is not");
        }

    }
    public static boolean isPalindrome(String checkWord) {
        checkWord = checkWord.replaceAll(" ", "");
        String checkWordFinal = checkWord.toLowerCase();

        int i = 0;
        int j = (checkWordFinal.length() -1);

        while (i < j) {
            if (checkWordFinal.charAt(i) != checkWordFinal.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}